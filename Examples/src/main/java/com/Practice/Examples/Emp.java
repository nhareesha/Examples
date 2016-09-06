package com.Practice.Examples;

import java.util.Comparator;

public class Emp implements Comparable<Emp>{
	
	int sal;
	String fname;
	int age;
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//sal comparator
	public static Comparator<Emp> salcomp = new Comparator<Emp>(){
	public int compare(Emp e1, Emp e2) {
		return e1.getSal()-e2.getSal();
	}};
	
	//age comparator
	public static Comparator<Emp> agecomp= new Comparator<Emp>(){

		public int compare(Emp o1, Emp o2) {
			return o2.getAge()-o1.getAge();
		}
	};
	
	//fname comparator
		public static Comparator<Emp> namecomp= new Comparator<Emp>(){

			public int compare(Emp o1, Emp o2) {
				return o1.getFname().compareTo(o2.getFname());
			}
		};
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
