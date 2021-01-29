package com.cg.studentcoursesystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.cg.studentcoursesystem.domain.Student;
import com.cg.studentcoursesystem.util.DBUtil;

public class StudentDAOImpl implements StudentDAO{
	EntityManagerFactory emf=DBUtil.getEntityManagerFactory();
	EntityManager em=emf.createEntityManager();
	EntityTransaction transaction=em.getTransaction();
	@Override
	public Student save(Student student) {
		// TODO Auto-generated method stub
		transaction.begin();
		em.persist(student);
		transaction.commit();
		em.close();
		emf.close();
		return student;
	}

	@Override
	public Student find(int studentId) {
		// TODO Auto-generated method stub
		transaction.begin();
		Student student = em.find(Student.class,studentId);
		transaction.commit();
		em.close();
		emf.close();
		return student;
	}

	@Override
	public Student update(Student updatedstudent) {
		// TODO Auto-generated method stub
		transaction.begin();
		Student student = em.find(Student.class,updatedstudent.getStudentId());
		student.setName(updatedstudent.getName());
		student.setAge(updatedstudent.getAge());
		transaction.commit();
		em.close();
		emf.close();
		return student;
		
	}

	@Override
	public boolean remove(int studentId) {
		// TODO Auto-generated method stub
		transaction.begin();
		Student student = em.find(Student.class,studentId);
		em.remove(student);
		transaction.commit();
		em.close();
		emf.close();
		
		return true;
	}

}
