package com.cursospring.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursospring.service.AutoevaluacionService;

@Service("evaluacionService")
public class AutoevaluacionServiceImpl implements AutoevaluacionService {

	private static final Log LOG = LogFactory.getLog(AutoevaluacionServiceImpl.class);
	
	@Autowired
	public String muestraMensaje(){
		String mensaje = "Mensaje de evaluacion creado desde el Servicio";
		LOG.info(mensaje);
		
		return mensaje;
	}
	
}
