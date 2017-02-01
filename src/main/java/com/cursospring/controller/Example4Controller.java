package com.cursospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("errores")
@RequestMapping("/error")
public class Example4Controller {

	
	public static final String ERROR = "/error/505";
	
	@GetMapping("/notFound")
	public String error404(){
		return "error";
	}
	
	
	@GetMapping("/underConst")
	public ModelAndView error505(){
		ModelAndView mav = new ModelAndView(ERROR);
		
		return mav;
	}
}
