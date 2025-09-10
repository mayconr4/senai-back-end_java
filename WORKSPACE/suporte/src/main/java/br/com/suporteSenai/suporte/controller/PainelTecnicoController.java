package br.com.suporteSenai.suporte.controller;

import java.util.Optional;

import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.suporteSenai.suporte.model.PainelTecnico;
import br.com.suporteSenai.suporte.model.Solicitacao;
import br.com.suporteSenai.suporte.repository.PainelTecnicoRepository;
import br.com.suporteSenai.suporte.repository.SolicitacaoRepository;

@Controller
public class PainelTecnicoController {
	
	@Autowired 
	private SolicitacaoRepository solicitacaoRepository;
	
	@Autowired
	private PainelTecnicoRepository painelTecnicoRepository; 	
	

	/**
	 * Exibe o painel técnico com todas as solicitações
	 * */ 	
	 
	@GetMapping("/painelTecnico")
	public String MostrarPainelTecnico(Model model) {
		Iterable<Solicitacao> solicitacoes = solicitacaoRepository.findAll();
		model.addAttribute("solicitacoes",solicitacoes);
		return "painelTecnico";
	}
	/**
	 * Método para assumir uma solicitação - redireciona para formulário do técnico
	 * */ 	
	
	@GetMapping("/assumirSolicitacao/{id}")
	public String assumirSolicitacao(@PathVariable("id") Long id,Model model) {
		Optional<Solicitacao> solicitacao = solicitacaoRepository.findById(id);
		if (solicitacao.isPresent()) {
			model.addAttribute("solicitacao",solicitacao.get());
			return "redirect:/painelTecnico";
		}
		return "redirect:/painelTecnico";
		
	}
	
	/**
	 * Método para processar o formulário do técnico (assumir a solicitação)
	 * */
	
	@PostMapping("/assumirSolicitacao")
	public String processarAssumirSolicitacao(
			@RequestParam Long idSolicitacao,
			@RequestParam String tecnicoResponsavel,
			@RequestParam String observacoes) {
		
		//Cria ou atualiza registro no PainelTécnico
		PainelTecnico painel = new PainelTecnico();
		painel.setIdSolicitacao(idSolicitacao);
		painel.setTecnicoResponsavel(tecnicoResponsavel);
		painel.setObservacoes(observacoes);
		painel.setStatus("Em Andamento");
		painel.setAcao("Assumida");
		
		painelTecnicoRepository.save(painel);
		
		//Atualiza status da solicitação
		Optional<Solicitacao> solicitacao = solicitacaoRepository.findById(idSolicitacao);
		if (solicitacao.isPresent()) {
			Solicitacao sol = solicitacao.get();
			sol.setStatus("Em andamento");
			solicitacaoRepository.save(sol);
		}
		
		return "redirect:/painelTecnico";
	}
	
	
	
	
}
