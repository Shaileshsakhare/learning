package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class CreatingObjects {
	public static void main(String[] args) {
		Person p1; //created a reference variable
		System.out.println("Variable Created");
		p1=new Person();
		System.out.println("Class Loaded");
		System.out.println("p1 is"+p1);
		System.out.println("Name = "+p1.name);
		System.out.println("Age = "+p1.age);
	}
}
