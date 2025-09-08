package br.com.agenda.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.agenda.agenda.model.Fornecedor;
import br.com.agenda.agenda.repository.FornecedorRepository;


@Controller
public class FornecedorController {
	
	@Autowired
	private FornecedorRepository repository;
	
	
	@GetMapping("/fornecedor")
	public String fornecedor() { 		
		return "fornecedor"; 
	}
	
	@PostMapping("/fornecedor")
	public String processarFormulario(@ModelAttribute Fornecedor fornecedor, Model model) {
		
		repository.save(fornecedor);
		
		model.addAttribute("fornecedor", fornecedor);
		
		return "fornecedor";
		
	}
	
}
