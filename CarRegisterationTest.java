import java.util.Scanner;

/**
 * File Name: CarRegisterationTest.java
 * Author: @author Himanish Rishi #041107547
 * Course: CST8284 - OOP
 * Assignment: Assignment 1
 * Date: January 25, 2024
 * Professor: Moshiur Rahman
 * */

/**
 * This is the main class that takes input from the user and by using the object of CarRegisteration class, checks
 * that the code has no errors and is working correctly*/
public class CarRegisterationTest {
	//Start of main method
	public static void main(String args[]) {
		//Declaring variables
		Scanner sc = new Scanner(System.in);
		double basePrice;
		double upgradeCoefficient=0; // value range: 1(no upgrade) to 2 (highest level upgrade)
		double colorIndex=0; // value range: 0 (default color) to 5000
		String firstName;
		String lastName;
		String gender;
		int birthYear;
		String occupation;
		double yearlyIncome;
		boolean condition=true;
		boolean condition2=true;
		
		/**Taking input from the user*/
		
		System.out.println("Please Enter your First Name");
		firstName = sc.next();
		

		System.out.println("Please Enter your Last Name");
		lastName = sc.next();
		
		
		System.out.println("Please Enter your Gender");
		gender = sc.next();
		

		System.out.println("Please Enter your Birth Year");
		birthYear = sc.nextInt();
		

		System.out.println("Please Enter your Occupation");
		occupation = sc.next();
		
		
		System.out.println("Please Enter your yearlyIncome");
		yearlyIncome = sc.nextInt();
		
		
		System.out.println("Please Enter Base Price of car");
		basePrice = sc.nextInt();
		
		//Using condition with loop so that the user cannot input wrong values
		while(condition) {
		System.out.println("Please Enter Upgrade Coefficient (1 or 2)");
		upgradeCoefficient = sc.nextDouble();
		if(upgradeCoefficient<=2 && upgradeCoefficient>=1) {
			condition=false;
		}
		else {
			System.out.println("The coefficient should be between 1 and 2. Please try again");
			condition=true;
		}
		}

		//Using condition with loop so that the user cannot input wrong values
		while(condition2) {
			System.out.println("Please Enter Color Index");
			colorIndex = sc.nextDouble();
			if(colorIndex<=5000 && colorIndex>=0) {
				condition2=false;
			}
			else {
				System.out.println("The index should be between 0 and 5000. Please try again");
				condition2=true;
			}
		}
		
		// Creating object of the class and assigning values
		CarRegistration c = new CarRegistration(basePrice, upgradeCoefficient, colorIndex, firstName, lastName, gender, birthYear,occupation,yearlyIncome);
			
		
		// Calculating customer's age by calling this method
		c.getCustomerAge();
		//Calling the print method
		c.displayCustomerInfo();
		System.out.println();
		System.out.println("Code by Himanish Rishi");
		}
	
	}
