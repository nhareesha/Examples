package com.Practice.Examples;

public class AnargamCheck {

	public static void main(String[] args) {
		String first = "Mary".toLowerCase();
		String second = "army".toLowerCase();
		
		char[] f = first.toCharArray();
		char[] s = second.toCharArray();
		boolean flag=false;
		if(f.length == s.length){
			for(char c : f){
				if(second.indexOf(Character.toString(c))==-1){ //here it check if the given character 
					//of first string is present in the second string
					flag=true;
					break;
				}
			}
			if(flag==true){
			System.out.println("Not anargams");}
		}
	}
	
	/* static boolean isAnagram(String a, String b) {
	        a=a.toLowerCase();
	        b=b.toLowerCase();
	        char[] a1 = a.toCharArray();
	        char[]b1 = b.toCharArray();
	        boolean flag= true;
	        int count1 = 0;
	        int count2 = 0;
	        for(char c : a1){
	          count1+=c;
	        }
	          for(char c : b1){
	          count2+=c;
	        }
	        if(count1==count2){
	            for(char c : a1){
	                if(b.indexOf(Character.toString(c))==-1){
	                    flag=false;
	                    break;
	                }
	            } 
	        }
	        else
	            flag=false;
	        return flag;
	        
	    }*/

}
