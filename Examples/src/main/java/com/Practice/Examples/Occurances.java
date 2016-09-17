package com.Practice.Examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Occurances {

	public static void main(String[] args) {
		String str = "HareesHa";
		char[] arr = str.toCharArray();
		List l = new ArrayList();
		for(int i=0;i<arr.length;i++){
			int count=1;
			for(int j=0;j<arr.length;j++){
				if(i!=j && arr[i]==arr[j]){
					count++;
				}
			}
			l.add(arr[i]+"\t"+count);
		}
		Set set = new HashSet();
		set.addAll(l);
		System.out.println(set);
	}

}
