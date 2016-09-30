package com.Practice.Examples;



public class ReapeatingCharacter {

	public static void main(String[] args) {
		
		//characters that reeated twice in the string
		//hareeshahahh
/*		List l = new ArrayList();
		for(int i=0;i<str.length();i++){
			int count=0;
			for(int j=i;j<str.length();j++){
				if(Character.toString(arr[i]).equalsIgnoreCase(Character.toString(arr[j]))){
					count++;
				}
			}
			if(count==3){
				l.add(arr[i]);
			}
		}
		
		System.out.println(l);	*/	
		String str="Hareesha";
		str=str.toLowerCase();
		char[] arr = str.toLowerCase().toCharArray();
		char ch=0;
		//firt non repeating character
		for(char charac : arr){
		if(str.indexOf(charac) == str.lastIndexOf(charac)){
			ch = charac;
			break;
		}
		
		
		}
		System.out.println(ch);
	}

}
