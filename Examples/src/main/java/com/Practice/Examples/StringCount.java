package com.Practice.Examples;

import java.util.Set;
import java.util.TreeSet;

public class StringCount {

	public static void main(String[] args) {
		String[] str = new String[]{"foo","bar","foo","car","foo","car","bar","bar"};
		Set<String> set= new TreeSet<String>();
		for(String a : str){
			int c=0;
			for(int i=0;i<str.length;i++){
				if(a.equals(str[i])){
					c=c+1;
				}
			}
			set.add(a+c);
		}
		System.out.println(set);
	}

}
