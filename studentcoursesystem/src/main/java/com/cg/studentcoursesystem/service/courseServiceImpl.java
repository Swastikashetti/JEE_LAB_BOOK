package com.cg.studentcoursesystem.service;

import com.cg.studentcoursesystem.dao.CourseDAO;
import com.cg.studentcoursesystem.dao.CourseDAOImpl;
import com.cg.studentcoursesystem.domain.Course;

public class courseServiceImpl implements courseService {
	CourseDAO courseDao= new CourseDAOImpl();
	@Override
	public void save(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
	}

	@Override
	public boolean find(int courseid) {
		// TODO Auto-generated method stub
		 courseDao.find(courseid);
		return false;
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		courseDao.update(course);
	}

	@Override
	public boolean remove(int courseid) {
		// TODO Auto-generated method stub
		return courseDao.remove(courseid);
	}

}
