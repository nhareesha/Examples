package com.Practice.Examples;

public class Reverse {

	public static void main(String[] args) {
		String str = "HAREESHA";
		char[] num = str.toCharArray();
		char[] rev = new char[str.length()];
		int j=0;
		for(int i=num.length-1;i>=0;i--){
			rev[j]=num[i];
			j++;			
		}
	System.out.println(rev);
	}

}
