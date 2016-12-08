package com.alanlviana.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alanlviana.modelo.EstruturaBanco;

@Controller
public class FuncionarioController {

	@Autowired
	private EstruturaBanco estruturaBanco;
	
	@RequestMapping("/funcionario/caixas")
	public String listaCaixaEletronico(Model model){
		model.addAttribute("caixas", estruturaBanco.getCaixas());
		return "caixas";
	}
	
}
