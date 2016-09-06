package com.Practice.Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class CollectionsEx{
	
public static void main(String args[]){
	
	//sorting primitive arrays or string arrays
	String[] arr = {"hareesha","samanvi","sunil","asdf"};
	Arrays.sort(arr);
	for(String i:arr){
	System.out.println(i.toString());
	}
	
	//sorting collection of objects of wrapper clasees like int string etc.then we can use Collections class
	List<String> ls = new ArrayList<String>();
	ls.add("Hareesha");
	ls.add("1234");
	ls.add(" this is a String");
	Collections.sort(ls);
	for(String i : ls)
	System.out.println(i);
	
	//sorting collection of custom objects like employee etc , using comaprable interface 
	//gives only one sort sequence 
	List<Employee> empls = new ArrayList<Employee>();
	Employee emp1 = new Employee();
	emp1.setAge("23");
	emp1.setName("abc");
	emp1.setSal(10000);
	emp1.setId("abc11");
	Employee emp2 = new Employee();
	emp2.setAge("13");
	emp2.setName("cab");
	emp2.setSal(1000);
	emp2.setId("abcp1");
	
	empls.add(emp1);
	empls.add(emp2);
	
	Collections.sort(empls);
	
	for(Employee e : empls)
		System.out.println(e.getName()+"  "+e.getSal());
	
	////If we need to have multiple sort sequences use comparator compare 
	List<Emp> empl = new ArrayList<Emp>();
	Emp em1 = new Emp();
	em1.setAge(23);
	em1.setFname("xeon");
	em1.setSal(5000);
	
	Emp em2 = new Emp();
	em2.setAge(56);
	em2.setFname("abc");
	em2.setSal(4000);
	empl.add(em1);
	empl.add(em2);
	
	Emp em3 = new Emp();
	em3.setAge(11);
	em3.setSal(20000);
	em3.setFname("sam");
	empl.add(em3);
	
	Collections.sort(empl,Emp.agecomp);
	
	for(Emp em : empl){
		System.out.println(em.getFname()+" "+em.getSal());
	}
	
	Collections.sort(empl, Emp.namecomp);
	for(Emp e : empl){
		System.out.println(e.getFname()+" "+e.age);
	}
	
}
}
