package com.touhe.ch2_16;

import java.util.Scanner;

/*
 * Write an application that asks the user to enter two integers, 
 * obtains them from the user and displays the larger number followed by the words "is larger". 
 * If the numbers are equal, print the message "These numbers are equal". Use the techniques shown in Fig.2.15
 */
public class Compare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer:"); // prompt
		int number1 = input.nextInt(); // read first number from user

		System.out.print("Enter second integer:"); // prompt
		int number2 = input.nextInt(); // read second number from user

			 if(number1 > number2) {
				System.out.printf("number 1 is bigger");

			} 
			 if (number1 == number2) {
					{
						System.out.printf("They are equal");
					}// end method main
		}
	}
}
