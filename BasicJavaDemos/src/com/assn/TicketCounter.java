package com.assn;

import java.util.Scanner;

/**
 * Ticket class => age price , date and time
 * Customer => name, address
 * @author Shalini
 *
 */
public class TicketCounter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean b = true;

		do {
			System.out.println("menu details");
			System.out.println("1.Display Ticket Details");
			System.out.println("2.Purchase Ticket");
			System.out.println("3,Exit");
			int x = sc.nextInt();
			switch(x){
			case 1 : System.out.println("Age         Price");
					System.out.println("Below 5      Free");
					System.out.println(">5 to 15     100");
					System.out.println(">15          150");
					break;
					
			case 2 : System.out.println("Enter Tickets");
				     int tickets = sc.nextInt();
			         int sum = 0;
			         for(int i=0;i<tickets;i++) {
			        	 System.out.println("Enter the age");
			        	 int age = sc.nextInt();
			        	 System.out.println("Enter the name");
			        	 String name = sc.next();
			        	 if(age>5 && age<15) {
			        		 sum+=100;
			        	 }
			        	 else if(age>=15) {
			        		 sum +=150;
			        	 }
			        	 else {
			        		 System.out.println("Your ticket is free");
			        	 }
			        	 
			         }
			         
			         System.out.println("Total amount to be paid "+sum);
			         break;
			case 3 : b = false;
			break;
			         
			}
		}
		while(b);
	}

}
