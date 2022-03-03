package com.example.manytomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.manytomany.entity.Course;

@Repository
public interface  CourseRepository extends JpaRepository<Course,Integer> {

}
