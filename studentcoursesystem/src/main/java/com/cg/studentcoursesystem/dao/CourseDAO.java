package com.cg.studentcoursesystem.dao;

import com.cg.studentcoursesystem.domain.Course;

public interface CourseDAO {
   
	public Course save(Course course);
	
	public Course find(int courseid);
	
	public Course update(Course course);
	
	public boolean remove(int courseid);

}
