package com.example.manytomany.testrunner;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.manytomany.entity.Course;
import com.example.manytomany.entity.Student;
import com.example.manytomany.repo.CourseRepository;
import com.example.manytomany.repo.StudentRepository;

@Component
public class RunnerClass implements CommandLineRunner {

	@Autowired
	StudentRepository sturepo;
	@Autowired
	CourseRepository   courserepo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
	Course course1 =new Course(1,"nitin",100.0);
	Course course2 =new Course(2,"Sachin",200.0);
	Course course3 =new Course(3,"pravin",300.0);
	Course course4 =new Course(4,"shivaji",400.0);
	
	
	
	
	Set<Course> set1=new HashSet<Course>();
	
		set1.add(course1);
		set1.add(course2);
		set1.add(course3);
		set1.add(course4);
		
		courserepo.saveAll(set1);
		
	 Student st1=new Student(1,"Nitin",set1);
	 
	 
	 sturepo.save(st1);
	 
	 
		
		
	}
	
	
	
	
	

}
