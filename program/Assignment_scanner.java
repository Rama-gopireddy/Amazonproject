package program;

import java.util.Scanner;

public class Assignment_scanner {

	public static void main(String[] args) {

		// using the scanner class please execute below problems

		// find area of circle
		/*
		 * int r;
		 * 
		 * double pi=3.14;
		 * 
		 * Scanner s1 = new Scanner(System.in);
		 * System.out.println("write the value of r");
		 * 
		 * r= s1.nextInt();
		 * 
		 * double area=pi*r*r;
		 * 
		 * System.out.println("Area of circle"+area);*/
		 

		// circumference of circle

		/*
		 * int r;
		 * 
		 * double pi=3.14;
		 * 
		 * Scanner s1 = new Scanner(System.in);
		 * System.out.println("write the value of r");
		 * 
		 * r= s1.nextInt();
		 * 
		 * double circumference=2*pi*r;
		 * 
		 * System.out.println( " circumference of circle"+circumference);
		 */

		// Find area of square

		/*
		 * int side,area;
		 * 
		 * 
		 * Scanner s1 = new Scanner(System.in); System.out.println("enter side square");
		 * 
		 * side= s1.nextInt();
		 * 
		 * area=side*side;
		 * 
		 * System.out.println("area of square"+area);
		 */

		// Find area of triangle

		/*
		 * Scanner s1 = new Scanner(System.in);
		 * 
		 * 
		 * {System.out.println("enter value of width"); }
		 * 
		 * double width=s1.nextDouble();
		 * 
		 * 
		 * {System.out.println("enter value of height"); } double height
		 * =s1.nextDouble();
		 * 
		 * 
		 * 
		 * //Area =width*height
		 * 
		 * double area=(width*height)/2; System.out.println("area of triangle"+area);
		 */

		// Find area of rectangle

		/*
		 * Scanner s1 = new Scanner(System.in);
		 * 
		 * 
		 * {System.out.println("enter value of lenth"); }
		 * 
		 * double lenth=s1.nextDouble();
		 * 
		 * 
		 * {System.out.println("enter value of width"); } double width =s1.nextDouble();
		 * 
		 * 
		 * 
		 * //Area =width*height
		 * 
		 * double area=lenth*width; System.out.println("area of rectangle"+area);
		 */

		// Find area of trapezium

		/*
		 * Scanner s1 = new Scanner(System.in);
		 * 
		 * {System.out.println("enter value of A"); }
		 * 
		 * double A=s1.nextDouble();
		 * 
		 * 
		 * {System.out.println("enter value of base1"); }
		 * 
		 * double base1=s1.nextDouble();
		 * 
		 * 
		 * {System.out.println("enter value of base2"); } double base2 =s1.nextDouble();
		 * 
		 * {System.out.println("enter value of height"); } double height
		 * =s1.nextDouble(); //Area =A=(a+b)*h/2
		 * 
		 * double area=A=(base1+base2)*height/2;
		 * System.out.println("area of trapezium"+area);
		 */

		// Circumference of square

		int side;
		

		Scanner s1 = new Scanner(System.in);
		System.out.println("write the value of side");

		side = s1.nextInt();
	

		int circumference = side * side;

		System.out.println(" circumference of square" + circumference);

	}

}
