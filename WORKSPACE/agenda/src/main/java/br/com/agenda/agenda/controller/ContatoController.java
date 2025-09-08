package br.com.agenda.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.agenda.agenda.model.Contato;
import br.com.agenda.agenda.repository.ContatoRepository;

@Controller
public class ContatoController {
	
	@Autowired
	private ContatoRepository repository; 	
	
	 @GetMapping("/contato")
	    public String contato() {
	        return "contato"; 
	    }
	 
	 @PostMapping("/contato")
	 public String processarFormulario(@ModelAttribute Contato contato, Model model) {
		 repository.save(contato);
		 
		 model.addAttribute("contato", contato);
		 
		 return "contato"; 	 
	 }
}
