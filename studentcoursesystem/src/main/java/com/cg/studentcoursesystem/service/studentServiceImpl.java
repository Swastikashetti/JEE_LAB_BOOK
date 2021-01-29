package com.cg.studentcoursesystem.service;

import com.cg.studentcoursesystem.dao.StudentDAO;
import com.cg.studentcoursesystem.dao.StudentDAOImpl;
import com.cg.studentcoursesystem.domain.Student;

public class studentServiceImpl implements studentService{
     StudentDAO studentDao =new StudentDAOImpl();
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		 studentDao.save(student);
	}

	@Override
	public boolean find(int studentId) {
		// TODO Auto-generated method stub
		studentDao.find(studentId);
		return false;
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		studentDao.update(student) ;
	}


	@Override
	public boolean remove(int studentId) {
		return studentDao.remove(studentId);
	}

}
