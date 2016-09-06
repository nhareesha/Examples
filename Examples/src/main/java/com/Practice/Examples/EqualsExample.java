package com.Practice.Examples;

public class EqualsExample {
	public static void main(String args[]){
		Person p = new Person();
		Person p1= new Person();
		p.setId("123");
		p1.setId("123");
		System.out.println(p.equals(p1));
	}
}


