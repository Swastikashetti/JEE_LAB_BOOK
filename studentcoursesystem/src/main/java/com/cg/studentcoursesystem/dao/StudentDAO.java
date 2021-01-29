package com.cg.studentcoursesystem.dao;

import com.cg.studentcoursesystem.domain.Student;

public interface StudentDAO {

	public Student save(Student student);
	
    public Student find(int studentId);
	
	public Student update(Student student);
	
	public boolean remove(int studentId);

}
