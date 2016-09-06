package com.Practice.Examples;

public class Employee implements Comparable<Employee>{
	String name;
	String age;
	String id;
	int sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return (this.sal- o.sal);
	}
	

}
