package com.cg.studentcoursesystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.cg.studentcoursesystem.domain.Course;
import com.cg.studentcoursesystem.util.DBUtil;

public class CourseDAOImpl extends DBUtil implements CourseDAO {
	EntityManagerFactory emf=DBUtil.getEntityManagerFactory();
	EntityManager em=emf.createEntityManager();
	EntityTransaction transaction=em.getTransaction();
	@Override
	public Course save(Course course) {
		// TODO Auto-generated method stub
		transaction.begin();
	    em.persist(course);
		transaction.commit();
		em.close();
		emf.close();
		return course;
	}

	@Override
	public Course find(int courseid) {
		// TODO Auto-generated method stub
		transaction.begin();
		Course course = em.find(Course.class, courseid);
		transaction.commit();
		em.close();
		emf.close();
		return course;
	}

	@Override
	public Course update(Course updatedcourse) {
		// TODO Auto-generated method stub
		transaction.begin();
		Course course =  em.find(Course.class,updatedcourse.getCourseId());
		course.setCourseName(updatedcourse.getCourseName());
		course.setCourseTutor(updatedcourse.getCourseTutor());
		course.setFee(updatedcourse.getFee());
		transaction.commit();
	    em.close();
		emf.close();
		return course;
	}

	@Override
	public boolean remove(int courseid) {
		// TODO Auto-generated method stub
		transaction.begin();
		Course course = em.find(Course.class,courseid);
		em.remove(course);
		transaction.commit();
		em.close();
		emf.close();
		
		return true;
	}

}
