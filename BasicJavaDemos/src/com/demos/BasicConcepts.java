package com.demos;

import java.util.Scanner;

public class BasicConcepts {

	public static void main(String[] args) {
		/*
		 * '' "" '''
		 * '' =>char
		 * "" => string
		 * dont have '''
		 */
		System.out.println("Hello World");
		System.out.println("hello"+2);
		/**
		 * dynamically typed language
		 * java, c statically typed language 
		 * byte
		 * char
		 * short
		 * int
		 * long
		 * float
		 * double
		 * boolean
		 */
		byte b  = 10;
		char ch = 'a';
		String name ="shalini";
		short s = 34;
		int x = -38;
		long l = 3435;
		float f = 3.4f;// adding suffix f is mandatory
		double d = 234234.234234;
		boolean choice = true; // false
		/**
		 * operators
		 * unary => ++ --
		 * binary => arithmetic + - * / %  DO NOT HAVE //
		 * relational < > <= >= == !=
		 * logical &&   || => short circuit operators & | 
		 * bitwise & | ^
		 * ternary ? :
		 */

		// taking input from the user
		/**
		 * python input => string int
		 * c input => %d %s
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		
//		int age = sc.nextInt();
//		// ?:
//		// whatever follows after ? is evaluated for true condition
//		// whatever follows after : is evaluated for false condition
//		String res = (age >= 18) ? "you can vote":"you cannot vote";
//		System.out.println(res);

		int n = 20;
		System.out.println(n%2!=0 & n++ >= 20);//false
		System.out.println(n);// 21
		
//		System.out.println(2!=0 & 2>0);
//		n = 20;
//		System.out.println(n%2!=0 || n++ >= 20);//true
//		System.out.println(n);//21
//		
//		n=20;
//		System.out.println(n%2==0 && n++ >= 20);//true
//		System.out.println(n);//20
//		
//		n=20;
//		System.out.println(n%2==0 && n++ >= 20);//true
//		System.out.println(n);//20
	}

}
