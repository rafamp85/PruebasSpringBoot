package com.cursospring.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cursospring.respository.CourseJpaRepository;

@Component("exampleComponent")
public class ExampleComponent {

	public static final Log LOGGER = LogFactory.getLog(ExampleComponent.class);
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRespository;
	
	public void sayHello(){
		
		LOGGER.info("HELLO FROM EXAMPLECOMPONENT");
	}
}
