package com.Practice.Examples;
/**
 * Overriding equals method to compare to user defined classes
 * @author Hareesha
 *
 */
public class Person {
	String name;
	String Id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
/**
 * equals method need to be over ridden when we have to compare the user defined classes
 */
	@Override
	public boolean equals(Object o){
		boolean result=false;
			if(o!=null){
				if(this.getId().equals(((Person)o).getId())){
					return true;
				}
			}
			return result;
		}
	}