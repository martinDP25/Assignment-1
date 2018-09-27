// -------------------------------------------------------
// Assignment 1
// Written by: Matthew Da Silva - 40008582
// For COMP 248 Section EE – Fall 2018
//
// My program can be broken down into 2 parts. The first part is simply my name
// printed in big letters. The second part is a BMI calculator I made, which 
// prompts the user to input their weight and height. The result is their BMI.
// --------------------------------------------------------

import java.util.Scanner; // import Scanner class to obtain user input

public class Question2 {

	public static void main(String[] args) {

		double weightKG; //declaring variable name in kilograms
		double heightM; //declaring variable name in meters


		Scanner talkToMe = new Scanner(System.in);

		System.out.println("Enter your weight in kilograms:"); //Prompts user to enter weight in kg
		weightKG = talkToMe.nextDouble();					   //Weight entered is stored in weightKG variable
		System.out.println("Enter your height in meters:");	   //Prompts user to enter height in meters
		heightM = talkToMe.nextDouble();					   //Height is stored in heightM variable


		//Displays weight, height, and BMI based on users input.
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("**********BMI**********");
		System.out.println("Your weight is: " + weightKG + "Kg");
		System.out.println(" ");
		System.out.println("Your height is: " + heightM + "M");
		System.out.println(" ");
		System.out.println("Your BMI is: " + (weightKG/heightM)/heightM);//String followed by BMI calculation 
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("***Thank you for using my BMI calculator!***");

		talkToMe.close();//Scanner closed
	}
}

