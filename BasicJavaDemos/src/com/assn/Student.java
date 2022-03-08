package com.assn;

public class Student {

	private int roll_no;
	private String name;
	private int marks;
	private String stream;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	public Student(int roll_no, String name, int marks, String stream) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
		this.stream = stream;
	}


	public void display()
	{
		System.out.println("Student details");
		System.out.println("Name "+name);
		System.out.println("Marks "+marks);
		System.out.println("Stream "+stream);
	}
}
