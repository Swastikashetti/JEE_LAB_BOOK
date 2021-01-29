package com.cg.studentcoursesystem.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int studentId;
	
	@Column
	private String name;
	
	@Column
	private int Age;
	
	@OneToMany
	@JoinTable(name="course_like",joinColumns= {@JoinColumn(name="studentId")}, inverseJoinColumns= { @JoinColumn(name="courseId")})
	private List<Course> courseList;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> course) {
		this.courseList = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", Age=" + Age + ", courseList=" + courseList
				+ "]";
	}

	public Student(int studentId, String name, int age, List<Course> courseList) {
		super();
		this.studentId = studentId;
		this.name = name;
		Age = age;
		this.courseList = courseList;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
