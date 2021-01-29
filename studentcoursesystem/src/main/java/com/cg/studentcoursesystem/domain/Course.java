package com.cg.studentcoursesystem.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Id;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Course {
	
	@Id
	@Column
	private int courseId;
	
	@Column
	private String courseName;
	
	@Column
	private String courseTutor;
	
	@Column
	private int fee;
	
	/**@Column(name="Count Courses")
	private int count;*/
	
	
	@OneToMany(mappedBy="courseList", cascade=CascadeType.ALL)
	private List<Student> studentList= new ArrayList<>();

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseTutor() {
		return courseTutor;
	}

	public void setCourseTutor(String courseTutor) {
		this.courseTutor = courseTutor;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int courseId, String courseName, String courseTutor, int fee, List<Student> studentList) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseTutor = courseTutor;
		this.fee = fee;
		this.studentList = studentList;
	}

	
}
