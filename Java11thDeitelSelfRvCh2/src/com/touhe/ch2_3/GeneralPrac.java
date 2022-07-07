package com.touhe.ch2_3;

import java.util.Scanner;

public class GeneralPrac {

	public static void main(String[] args) {
		
		/*
		1. Declare variables c, thisIsAVariable, q76354 and
		number to be of type int and initialize each to 0.
		2. Prompt the user to enter an integer.
		3. Input an integer and assign the result to int variable value.
		Assume Scanner variable input can be used to read a value
		from the keyboard.
		4. Print "This is a Java program" on one line in the
		command window. Use method System.out.println.
		5. Print "This is a Java program" on two lines in the
		command window. The first line should end with Java. Use
		method System.out.printf and two %s format specifiers.
		6. If the variable number is not equal to 7, display "The
		variable number is not equal to 7".
		
		Author: Touhedul Islam

         */
		//1
		
		int c;
		int thisIsAVariable;
		int q76354;
		int number;
		c= 0; 
		thisIsAVariable = 0;
		q76354 = 0;
		number = 0;
		
		//2
		System.out.println("enter an integer: ");
		//3
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		//4
		System.out.println("This is a java program");
		//5
		System.out.printf("%s%n%s%n","This is a java", "program" );
		
		//6
	
		if (number!= 7) {
			System.out.println("The variable number is not equal to 7");
		}
		

	}

}
