package com.touhe.ch2_17;

import java.util.Scanner;

/*
 * Write an application that inputs three integers from the user and 
 * displays the sum, average, product, smallest and largest of the numbers. 
 * Use the techniques shown in Fig.2.15 . [Note: The calculation of the average 
 * in this exercise should result in an integer representation of the average.
 *  So, if the sum of the values is 7, the average should be 2, not 2.3333….]
 * 
 * Author: Touheudul Islam
 */

public class SmallLargeComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	        // create Scanner to obtain input from command window
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter first integer:"); // prompt for input
	         int x = input.nextInt(); // read first integer
	         System.out.print("Enter second integer:"); // prompt for input
	         int y = input.nextInt(); // read second integer
	         System.out.println("Enter third integer:");
	         int z = input.nextInt();
	         
	         int sum = (x*y*z);
	         int average = (x+y+z)/3;
	         int product = x+y+z;
	         
	         int largest = x;
	 		if (y> largest)
	 			largest = y;
	 		if (z > largest)
	 			largest = z;

	 		int smallest = x;
	 		if (y < smallest)
	 			smallest = y;
	 		if (z < smallest)
	 			smallest = z;

	 		System.out.printf("Sum is %d%n", sum);
	 		System.out.printf("Average is %d%n", average);
	 		System.out.printf("Product is %d%n", product);
	 		System.out.printf("Largest is %d%n", largest);
	 		System.out.printf("Smallest is %d%n", smallest);
	 	}
	 
	       
	}


