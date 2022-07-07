package com.touhe.ch2_5;

/*1. State that a program will calculate the product of three integers.
2. Create a Scanner called input that reads values from the
standard input.
3. Prompt the user to enter the first integer.
4. Read the first integer from the user and store it in the int
variable x.
5. Prompt the user to enter the second integer.
6. Read the second integer from the user and store it in the int
variable y.

7. Prompt the user to enter the third integer.
8. Read the third integer from the user and store it in the int
variable z.
9. Compute the product of the three integers contained in variables
x, y and z, and store the result in the int variable result.
10. Use System.out.printf to display the message "Product
is" followed by the value of the variable result.



Author: Touhedul Islam
 */

import java.util.Scanner;

public class Statements {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
//1		
int a,b,c;
System.out.println("a+b+c");
//2
Scanner input = new Scanner(System.in);

//3
System.out.println("enter the first integer");
//4

int x= input.nextInt();
//5
System.out.println("enter the second integer");

//6
int y = input.nextInt();
//7
System.out.println("enter the third integer");
//8
int z = input.nextInt();

int result = x+y+z;

//10 
System.out.printf("%s%n%d%n","product is",result);

	}

}
