package com.cursospring.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.cursospring.service.AutoevaluacionService;
import com.cursospring.service.impl.AutoevaluacionServiceImpl;

@Controller
@RequestMapping("/ejercicio")
public class Autoevaluacion1Controller {

	private static final Log LOG = LogFactory.getLog(Autoevaluacion1Controller.class);
	private static final String RESULTADO = "paginaEvaluacion";
	
	@Autowired
	@Qualifier("evaluacionService")
	AutoevaluacionService evaluacionService;
	
	
	@GetMapping("/")
	public RedirectView entradaPrincipal(){
		LOG.info("Iniciando el Proceso de evaluacion");
		return new RedirectView("/ejercicio/salida");
	}
	
	@GetMapping("/salida")
	public String salida(Model model){
		LOG.info("Direccionamiento correcto");
		String mensaje = evaluacionService.muestraMensaje();
		model.addAttribute("evaluacion", mensaje);
		
		return RESULTADO;
	}
}
