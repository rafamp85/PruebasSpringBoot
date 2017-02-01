package com.cursospring.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cursospring.controller.CourseController;
import com.cursospring.entity.Course;
import com.cursospring.respository.CourseJpaRepository;
import com.cursospring.service.CourseService;

@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService {
	
	
	private static final Log LOG = LogFactory.getLog(CourseService.class); 
	
	@Autowired
	@Qualifier("courseJpaRepository")
	private CourseJpaRepository courseJpaRespository;

	@Override
	public List<Course> listAllCourses() {
		LOG.info("Call: " +  " listAllCourses()");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course addCourse(Course course) {
		LOG.info("Call: " +  " addCourse()");
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int removeCourse(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
