package com.Practice.Examples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetsQ {

	public static void main(String[] args) {
		
		Set<Integer> s1 =new HashSet<Integer>(); //Hashset doesn't remembers the order in which elements are entered[1,2,3]
		s1.add(3);
		s1.add(1);
		s1.add(2);
		System.out.println(s1);
		
		Set<Integer> s2 =new LinkedHashSet<Integer>(); //LinkedHashSet maintes the order inwhich elements are entered
		
		s2.add(3);s2.add(1);s2.add(2);
		System.out.println(s2);
	}

}
