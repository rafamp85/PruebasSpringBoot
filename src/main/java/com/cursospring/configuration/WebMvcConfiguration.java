package com.cursospring.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cursospring.component.RequestTimeInterceptor;

@Configuration
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	@Qualifier("requestTimeInterceptor")
	private RequestTimeInterceptor requestTimeInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(requestTimeInterceptor);
	}

}
