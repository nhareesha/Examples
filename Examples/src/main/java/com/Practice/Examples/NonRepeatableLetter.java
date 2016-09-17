package com.Practice.Examples;


public class NonRepeatableLetter {
//HARA
	//first non repeating character
	public static void main(String[] args) {
		
		String app= "epple";
		char[] arr = app.toCharArray();
		for(char i : arr){
			if(app.indexOf(i)==app.lastIndexOf(i)){
				System.out.println(i);
				break;
			}
		}
	/*****************/	
		String str = "hareesha";
		char[] arr1 = str.toCharArray();
		for(int i = 0; i< arr1.length ;i++){
			int count = 0;
			for(int j=0;j<arr1.length;j++){
				if(i!=j && arr1[i] == arr1[j]){
					count++;
				}
			}
			if(count==0){
				System.out.println(arr1[i]);
				break;
			}
		}
	}
}