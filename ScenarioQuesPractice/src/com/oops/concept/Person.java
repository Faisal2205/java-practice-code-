package com.oops.concept;

class Person {
     
	String name;
	String age;
	
	public Person(String name, String age)
	{
		this.name = name;
		this.age = age;
	}
	void introduce()
	{
		System.out.println("My name is "+name+" & my age is "+age);
	}
}
