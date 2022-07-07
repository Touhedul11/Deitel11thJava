package com.touhe.ch2_15;
/*
 * Write an application that asks the user to enter two integers, 
 * obtains them from the user and prints their sum, product, difference and quotient (division). 
 * Use the techniques shown in Fig.2.7 .
 * 
 * Author: Touhedul Islam
 */

 import java.util.Scanner; // program uses Scanner

  public class Arithmetic {
      public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer:"); // prompt for input
         int x = input.nextInt(); // read first integer
         System.out.print("Enter second integer:"); // prompt for input
         int y = input.nextInt(); // read second integer
       
        int sum = x +y ;
        
        int product = x * y ; // calculate product of numbers
        
        int difference = x-y;
        
        int division  = x/y;
        
        System.out.println("Sum is: " + sum);
        System.out.println("Product is: "+ product);
        System.out.println("Difference is: "+difference);
        System.out.println("division is: "+division);




        
     } // end method main
   } // end class Product