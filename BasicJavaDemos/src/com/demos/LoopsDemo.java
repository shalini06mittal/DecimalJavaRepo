package com.demos;

import java.util.Scanner;

public class LoopsDemo {

	public static void main(String[] args) {
		/**
		 * for x in []:
		 * 	
		 */

		int x =1;
		while (x<=5)
		{
			System.out.println(x*x);
			x++;
		}
		/**
		 * 1) WAP to print the total of invoices generated from Jan to March
		 * Ask the user to enter the number of invoices for jan. Then take the amount 
		 * and print the total for jan month. Do so for feb and march as well
		 * 
		 * 2) WAP to take amount of 5 invoices from the user and display
		 * the sum of all the invoices
		 */
		for(int n=1;n<=5;n++ )
			System.out.println(n*n);
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter a no or -1 to exit");
			int n = sc.nextInt();
			if(n==-1)
			{
				System.out.println("Thanks ");
				break;
			}
			System.out.println(n+" : "+Math.pow(n, 3));

		}while(true);

		
		int sum=0;
		for (int i=1;i<6;i++) {
			System.out.println("ENTER NUMBER : ");
			int input=sc.nextInt();	
			sum= sum+input;
		}
		System.out.println(sum);

	}

}
