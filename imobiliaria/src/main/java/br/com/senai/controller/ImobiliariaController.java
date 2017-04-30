package br.com.senai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.senai.model.CadastroCliente;
import br.com.senai.model.CadastroImovel;
import br.com.senai.repository.Cliente;
import br.com.senai.repository.Imobiliaria;

@Controller
public class ImobiliariaController {

	@Autowired
	private Imobiliaria imobiliaria;
	private Cliente cliente;
	
	@RequestMapping("/imobiliaria")
	public ModelAndView listar (){
		
		ModelAndView mv = new ModelAndView("cadastroImovel");
		
		
		mv.addObject("imovel" , new CadastroImovel());
		mv.addObject("imoveis", imobiliaria.findAll());
		
		return mv;
	}
	
	@RequestMapping(value="/imobiliaria", method = RequestMethod.POST)
	public String salvar(CadastroImovel imovel ){
		imobiliaria.save(imovel);
		return "redirect:/imobiliaria";
	}
	
	@RequestMapping("/cliente")
	public ModelAndView listarCliente (){
		
		ModelAndView mv = new ModelAndView("cadastroCliente");
		
		
		mv.addObject("cliente" , new CadastroCliente());
		mv.addObject("clientes", imobiliaria.findAll());
		
		return mv;
	}
	
	@RequestMapping(value="/cliente", method = RequestMethod.POST)
	public String salvarCliente(CadastroCliente clientes ){
		cliente.save(clientes);
		return "redirect:/imobiliaria";
	}
}
