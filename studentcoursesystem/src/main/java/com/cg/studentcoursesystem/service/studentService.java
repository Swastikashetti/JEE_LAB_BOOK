package com.cg.studentcoursesystem.service;

import com.cg.studentcoursesystem.domain.Student;

public interface studentService {

	void save(Student student );
	
	boolean find(int studentId );
	
	void update(Student student );
	
	boolean remove(int studentId );
}
