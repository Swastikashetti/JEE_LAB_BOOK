package com.cg.studentcoursesystem.util;

import java.util.Scanner;

import com.cg.studentcoursesystem.domain.Course;
import com.cg.studentcoursesystem.domain.Student;
import com.cg.studentcoursesystem.service.courseService;
import com.cg.studentcoursesystem.service.courseServiceImpl;
import com.cg.studentcoursesystem.service.studentService;
import com.cg.studentcoursesystem.service.studentServiceImpl;

public class MenuUtil {
	
	public void start()
	{
		Scanner sc = new Scanner(System.in);
		studentService studentService = new studentServiceImpl();
		courseService courseService = new courseServiceImpl();
		
		int choice = 0;
		do
		{
			System.out.println("Enter 1 to add Student Detail ");
			System.out.println("Enter 2 to find a Student ");
			System.out.println("Enter 3 to update student ");
			System.out.println("Enter 4 to Remove Student  ");
			System.out.println("Enter 5 to add the Course ");
			System.out.println("Enter 6 to find a Course ");
			System.out.println("Enter 7 to update Course ");
			System.out.println("Enter 8 to Remove Course  ");
			System.out.println("Enter 0 to Exit ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1 : {
				     System.out.println("Enter student name : ");
			         String studentname = sc.next();
			         
			         System.out.println("Enter student age : ");
			         int age = sc.nextInt();
			         
			         Student student = new Student();
			         student.setName(studentname);
			         student.setAge(age);
			         
			         studentService.save(student);
			break;
			}
			case 2 : {
				     System.out.println("Enter Student id :");
				     int studentId= sc.nextInt();
				     System.out.println(studentService.find(studentId));
				     break;
			         }
			case 3 :{
				     System.out.println("Enter student id :");
				     int studentId=sc.nextInt();
				     System.out.println("Enter Student Name");
				     String name = sc.next();
				     System.out.println("Enter student age : ");
			         int Age = sc.nextInt();
			         Student student = new Student();
			         student.setStudentId(studentId);
			         student.setName(name);
			         student.setAge(Age);
			         studentService.update(student);
			         break;
			         }
			case 4 : {
			     System.out.println("Enter Student id :");
			     int studentId= sc.nextInt();
			     System.out.println(studentService.remove(studentId));
			     break;
		              }
			case 5 :
			{
				System.out.println("Enter the course Id");
				int courseid = sc.nextInt();
				System.out.println("Enter name of the course :");
				String coursename = sc.next();
				System.out.println("Enter trainer for the course :");
				String trainername=sc.next();
				System.out.println("Enter fee amount for the course :");
				int fee = sc.nextInt();
				Course course = new Course();
				course.setCourseId(courseid);
				course.setCourseName(coursename);
				course.setCourseTutor(trainername);
				course.setFee(fee);
				courseService.save(course);
				break;
			}
			case 6 :
			{
				System.out.println("Enter the courseid :");
				int courseid = sc.nextInt();
				System.out.println(courseService.find(courseid));
				break;
			}
			case 7 :
			{
				System.out.println("Enter the course Id");
				int courseid = sc.nextInt();
				System.out.println("Enter name of the course :");
				String coursename = sc.next();
				System.out.println("Enter trainer for the course :");
				String trainername=sc.next();
				System.out.println("Enter fee amount for the course :");
				int fee = sc.nextInt();
				Course course = new Course();
				course.setCourseId(courseid);
				course.setCourseName(coursename);
				course.setCourseTutor(trainername);
				course.setFee(fee);
				courseService.update(course);
			}
			case 8 :
			{
				System.out.println("Enter the courseid :");
				int courseid = sc.nextInt();
				System.out.println(courseService.remove(courseid));
				break;
			}
			case 0 : {
				break;
			}
			default :
			{
				System.out.println("Invalid Input");
			}
			}
		}
		while(choice!=0);
		sc.close();
	}
}
