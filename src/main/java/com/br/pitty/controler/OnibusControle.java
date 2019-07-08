package com.br.pitty.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.pitty.model.PessoaModel;
import com.br.pitty.service.OnibusService;

@Controller
public class OnibusControle {

	@Autowired

	OnibusService onibusService;

	@RequestMapping("/")
	public ModelAndView mostrarOnibus() {
		ModelAndView modelAndView = new ModelAndView("mostrar.html");
		modelAndView.addObject("busao",onibusService.mostrar());
		return modelAndView;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView modelAndView = new ModelAndView("redirecionar.html");
		return modelAndView;


	}
	@GetMapping("/meCadastar")
	public ModelAndView redicionar() {
		ModelAndView modelAndView = new ModelAndView("cadastrar.html");
		return modelAndView;

	}

	@GetMapping("/meCadastar")
	public String salvarPessoa(PessoaModel Pessoa) {		
		 onibusService.cadastrar(Pessoa);
		 return "redirect:/menorIdade";

	}
//	@RequestMapping("/naofoi")
//	public ModelAndView redicionarq() {
//		ModelAndView modelAndView = new ModelAndView("menorIdade.html");
//		return modelAndView;
//
//	}
}
