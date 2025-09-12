package br.com.suporteSenai.suporte.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.suporteSenai.suporte.model.Solicitacao;
import br.com.suporteSenai.suporte.repository.SolicitacaoRepository;

@Controller
public class solicitacaoController {
	@Autowired

	private SolicitacaoRepository sr;
	
	
	@GetMapping(value="/solicitacao")
	public String solicitacao() {
		return "solicitacao";
	}
	
	@PostMapping(value="/solicitacao")
		public String solicitacao(Solicitacao solicitacao) {
		sr.save(solicitacao);	
		return "redirect:/solicitacao";
		
	}
	
}
