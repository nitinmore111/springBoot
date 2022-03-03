package com.example.manytomany.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@Column(name="sid")
	private Integer stdId;
	@Column(name="sname")
	private String stdName;
	
	
	@ManyToMany
	@JoinTable(
			
			name="stdcourtab",
			joinColumns = @JoinColumn(name="sidFk"),
			inverseJoinColumns = @JoinColumn(name="courseFk")
			)
	
	private Set<Course> course;
}
