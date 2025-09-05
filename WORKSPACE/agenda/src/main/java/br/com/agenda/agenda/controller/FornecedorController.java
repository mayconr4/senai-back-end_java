package br.com.agenda.agenda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FornecedorController {
	
	@GetMapping("/fornecedor")
	public String fornecedor() {
		return "fornecedor";
	}
	
}
