package com.Practice.Examples;

public class DynamicRef {

	public static void main(String[] args) {
			Ref1 obj1 = new Ref2();
				obj1.method1();// obj1 wll have access to only Ref1 type though it is referencing to sub class, 
				//unless same methods are methods in both the classes
				obj1.method();
			//Ref2 obj2 = (Ref2) new Ref1();
			
	}

}
