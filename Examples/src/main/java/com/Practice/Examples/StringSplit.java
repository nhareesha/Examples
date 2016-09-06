package com.Practice.Examples;

public class StringSplit {

	public static void main(String[] args) {

		String msg = "$18,201 – $37,000 19c for each $1 over $18,200";
		
		String[] arr = msg.split("\\s", 4);
		for(String a : arr){
			System.out.println(a);			
		}
		System.out.println(arr[2].replace(",", "").replace("$",""));
		
		System.out.println(arr[3].replace("c", ""));
	}

}
