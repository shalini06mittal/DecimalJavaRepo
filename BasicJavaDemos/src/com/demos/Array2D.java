package com.demos;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nos[][] = {
				{1,2,3,4,5,6},
				{5,6,7,8,9,10},  
				{9,10,11,12,13,14},
				{10,20,30,40,50,60},
				{1,2,3,4,5,6}
		};

		//int nos[][] = new int[5][6];
		Scanner sc = new Scanner(System.in);

//		for (int i = 0; i < nos.length; i++) {
//			for (int j = 0; j < nos[i].length; j++) {
//				System.out.print("Enter value ");
//				nos[i][j] = sc.nextInt();
//			}
//			System.out.println();
//		}

		System.out.println("Total Sales Storewise");
		for (int i = 0; i < nos.length; i++) {
			int sum = 0;
			for (int j = 0; j < nos[i].length; j++) {
				sum += nos[i][j];
			}
			System.out.println("Total Sale of Store "+(i+1)+ " : "+sum);
		}	
		System.out.println();
		System.out.println("Total Sales Departmentwise");
		for (int i = 0; i < nos[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < nos.length; j++) {
				sum += nos[j][i];
			}
			System.out.println("Total Sale of Department "+(i+1)+ " : "+sum);
		}	
	}

}
