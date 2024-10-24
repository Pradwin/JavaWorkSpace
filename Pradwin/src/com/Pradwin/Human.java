package com.Pradwin;

public class Human {
	String name;
	int age;
	Human (String name , int age){
		this.name = name;
		this.age = age;
	}
	void work() {
		System.out.println(this.name+" is an Engineer");
	}
	public String toString() {
		return this.name+"\n"+this.age;
	}

}
