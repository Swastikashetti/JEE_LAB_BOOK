package com.cg.studentcoursesystem.service;

import com.cg.studentcoursesystem.domain.Course;

public interface courseService {

	void save(Course course);
	
	boolean find(int courseid);
	
	void  update(Course course);
	
	boolean remove(int courseid);
	
	
}
