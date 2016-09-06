package com.Practice.Examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * equals and hashCode method both need to be implemented in order 
 * for the hash based collection objects like HashMa and HashSet
 * @author SunilKumar
 *
 */
public class EqualsExample {
	public static void main(String args[]){
		Person p1 = new Person("Rob","100");
		Person p2 = new Person("Steve","101");
		Person p3 = new Person("Rob","100");
		Person p4= new Person("Lary","103");
		
		Map<Person,String> map= new HashMap<Person, String>();
		map.put(p1,"Group1");
		map.put(p2, "Group1");
		map.put(p3,"Group2");
		map.put(p4, "Group1");
		
		System.out.println(p1.equals(p3));//here result is false , since if there is no equls method it deos == comparision
		System.out.println(map.get(p3));
		
		///
		
		Set<Person> set= new HashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		System.out.println(set);
		
		
		
		
	}
}


