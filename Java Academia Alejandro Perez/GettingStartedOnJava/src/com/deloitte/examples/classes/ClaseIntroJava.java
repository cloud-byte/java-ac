package com.deloitte.examples.classes;

import java.util.Scanner;  // Import the user input "scanner class"
import java.lang.Math; 	// Import the exponential function

public class ClaseIntroJava {
	public static void main(String[] args) { 
		System.out.println("Hello everybody!"); // access configuration: default, private, protected, public 
		System.out.println("");
		System.out.println("Whatcha doing?");
		System.out.println("");
		
		Scanner sc = new Scanner(System.in); // define scanner function
		System.out.println("Please enter a number between 1-100: ");
		int data1 = sc.nextInt();
		System.out.println("Your first number is " + data1);
		System.out.println("Please enter another number smaller than 100: ");
		int data2 = sc.nextInt();
		System.out.println("Your second number is " + data2);
		System.out.println("");	
		
		System.out.println("Ready for some statistics?...");
		System.out.println("");	
		int sum = data1 + data2;	//Sum
		System.out.println("The sum of your numbers is: "+ sum);
		int diff = data1 - data2;	//Substraction
		System.out.println("The difference between your numbers is: "+ diff);
		int multi = data1 * data2;	//Multiplication
		System.out.println("The product between your numbers is: "+ multi);
		int div = data1 / data2; 	//Division
		System.out.println("The quotient between your numbers is: "+ div);
		int mod = data1 % data2;	//Module
		System.out.println("The remainer between your numbers is: "+ mod);
		double pow = Math.pow(data1,data2);
		long powround = Math.round(pow); //round to integer
		System.out.println("The first number elevated to your second number is: "+ powround);
		//if (data1 > data2) {
		//	float percent = ((data2 / data1)*100);
		//	System.out.println("The percentage of the smaller number inside the bigger one is: "+ percent);
		//}
		float per = (float) (data1/data2); // percentage CHECK FOR ERRORS
		System.out.println("The percentage of the smaller number inside the bigger one is: "+ per);
				}
	
}


