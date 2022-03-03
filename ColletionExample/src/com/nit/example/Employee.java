package com.nit.example;

public class Employee implements Comparable{

	
	

		
		int id;
		String name;
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		String dept;
		
		Employee( int id, String name , String dept)
		
		{
			this.id=id;
			this.name=name;
			this.dept=dept;
			
		}

		@Override
		public int compareTo(Object o) {
			// TODO Auto-generated method stub
			Employee emp1 =(Employee) o;
			
			return this.id-emp1.id;
		}
		
		
		
	}

