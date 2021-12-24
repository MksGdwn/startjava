package com.startjava.lesson_2_3_4.person;

public class Person {
	char sex = 'm';
	String name = "Person";
	double height = 1.8;
	double weight = 90;
	int age = 30;

	public String walk() {
		return name + " is walking";
	}

	public String sit() {
		return name + " is sitting";
	}

	public String run() {
		return name + " is running";
	}

	public String speak() {
		return name + " is speaking";
	}

	public String learnJava() {
		return name + " is learning Java";
	}
}