package com.assn;

import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {

		double amt=0,dis=0,total=0,df=0;

	
		
		System.out.println("Enter amount");
		Scanner sc=new Scanner(System.in);
		amt=sc.nextDouble();
		if(amt<1000)
		{
			System.out.println("no discount");

		}
		else if(amt==1000)
		{
			dis =0.02;


		} 
		else if(amt>1000 && amt<=5000)
		{
			dis =0.05;

		}
		else if(amt>5000 && amt<=10000)
		{
			dis =0.10;

		}
		else
		{
			dis=0.20;

		}

		df=(amt*dis);
		total = amt-df;
		System.out.println("actual amount: "+amt);
		System.out.println("discount offered "+df);
		System.out.println("discount amount "+total);
	}
}
