package oops;

import java.util.Scanner;

public class BoxTest {

	public static void main(String[] args) {
		// int = 4 bytes 4*3 = 12
		// x is a local variable
		int x; // x is a avariable of type int, primitive or basic or standard as size is fixed
		// b1 is a reference/ instance variable of type Box
		Box b1 = new Box();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dimensions");
		// cm 
		int w1 = sc.nextInt();
		int length= sc.nextInt();
		int h = sc.nextInt();
		// ue dot operator to access the members of a class
		b1.initialize(w1,length,h);
		//b1.height = 5;
		b1.setHeight(5);
		
		//System.out.println(b1.height* b1.length * b1.width);
		int vol = b1.calVolume();
		System.out.println("Volume is "+vol);
		Box b2 = new Box();
//		// use dot operator to access the members of a class
//		b2.width = 2;
//		b2.height = 3;
//		b2.length = 4;
		b2.initialize(2, 3, 4);
		//System.out.println(b2.height* b2.length * b2.width);
		vol = b2.calVolume();
		//System.out.println("Volume of the box with dimensions "+b2.width+"*"+b2.length+"*"+b2.height+" : "+vol);
	}

}
