package com.assn;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student(22,"richa",50,"electronics");
		s1.display();
		Student[] s2 = new Student[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;++i) {
			System.out.println("enter rollnumber");
			int roll_no = sc.nextInt();
			System.out.println("enetr name");
			String name = sc.next();
			System.out.println("enter marks");
			int marks = sc.nextInt();
			System.out.println("enter stream");
			String branch = sc.next();
			Student s = new Student(roll_no, name, marks, branch);
			s2[i] = s;
			
		}
		for (int i = 0; i < s2.length; i++) {
			s2[i].display();
		}

	}

}
