package com.demos;

public class ArrayDemo {

	public static void main(String[] args) {
		
		/**
		 * c =[] or () or {} len(c)
		 * int a[2] a.length
		 * 
		 */
		// 1) declare
		float a[];
		// 2) allocate memory
		a = new float[5];
		System.out.println(a.length);// 5 index from 0 to 4
		// CANNOT SAY THIS
		//int x[5];
		//a[] = new int[5];
		//3) to initialize values => indexing
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);// 0 1 2 3 
		}
		// can combine declartions and crreation in 1 line
		int n[] = new int[10];
		// combine declare, create and initialize
		String colors[] = {"Red","Blue","Green"};
	}
}
