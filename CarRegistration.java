/**
 * File Name: CarRegisterationTest.java
 * Author: @author Himanish Rishi #041107547
 * Course: CST8284 - OOP
 * Assignment: Assignment 1
 * Date: January 25, 2024
 * Professor: Moshiur Rahman
 * */

/*
 * This class extends the base class CarRegistration.
 */

public class CarRegistration extends CarSelection {
	// variable to hold the buyer's first name
	private double basePrice;
	private double upgradeCoefficient; // value range: 1(no upgrade) to 2 (highest level upgrade)
	private double colorIndex; // value range: 0 (default color) to 5000
	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private String occupation;
	private double yearlyIncome;
	// The approved variable stores true/false depending on whether a customer is approved or not for a loan, respectively
	private boolean approved;
	
	private int customerAge;
	
	
	public static int currentYear = 2024;
	
	/*
	 * Constructor to instantiate a car registration object of the class
	 * @param firstName
	 * @param lastName
	 * @param gender
	 * @param birth year
	 * @param yearly income
	 */
	public CarRegistration(double basePrice, double upgradeCoefficient,double colorIndex, String firstName, String lastName, String gender, int birthYear, String occupation, double yearlyIncome) {
	// To Do: complete the constructor
		super();
		this.basePrice = basePrice;
		this.upgradeCoefficient = upgradeCoefficient;
		this.colorIndex = colorIndex;
		this.firstName= firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthYear = birthYear;
		this.occupation = occupation;
		this.yearlyIncome = yearlyIncome;
		
	}
		
	// To Do: add appropriate setter and getter methods
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	
	
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	
	
	
	
	public void setBirthYear(int birthYear) {
		this.birthYear=birthYear;
	}
	public int getbirthYear() {
		return birthYear;
	}
	
	
	
	
	public void setOccupation(String occupation) {
		this.occupation=occupation;
	}
	public String occupation() {
		return occupation;
	}
	
	
	
	
	public void setYearlyIncome(int yearlyIncome) {
		this.yearlyIncome=yearlyIncome;
	}
	public double getYearlyIncome() {
		return yearlyIncome;
	}
		
	
	
	
	public double getUpgradeCoefficient() {
		return upgradeCoefficient;
	}

	public void setUpgradeCoefficient(double upgradeCoefficient) {
		this.upgradeCoefficient = upgradeCoefficient;
	}

	
	
	
	public double getColorIndex() {
		return colorIndex;
	}

	public void setColorIndex(double colorIndex) {
		this.colorIndex = colorIndex;
	}		
	
	/*
	 * This method calculates a customer's age
	 */
	public int getCustomerAge() {
		customerAge = currentYear - birthYear;
		return customerAge;
	}
	/*
	 * This function checks whether a customer is eligible to purchase the car
	 * and prints out a message about it.
	 * To Do: a car's price should not be more than 20% of the customer's yearly
	 * salary. Implement the method below accordingly.
	 */
	public boolean isPreApproved() {
		if(super.calculateCarPrice(basePrice, upgradeCoefficient, colorIndex) <= (0.2*yearlyIncome))
		{
			approved = true;
			System.out.println("You are eligible to purchase the car");
		}
		else
		{
			approved = false;
			System.out.println("You are not eligible to purchase the car. Your car's price should not be more than 20% of your yearly salary");
		}
		return approved;
	}
		
/*
 * This function check if a customer is eligible to drive and prints a relevant message.
 * To Do: a customer's age should be at least 16 years to be eligible to drive.
 */
	public void isEligibleToDrive(){
		if(customerAge >= 16 ) {
			System.out.println("You are eligible to drive");
		}
		else
		{
			System.out.println("You are not eligible to drive");
		}
	}
	
	/*
	* This function prints the customer’s information 
	*/
	public void displayCustomerInfo() {
		/*
		 * print out the customer's following information
		 * first name, last name
		 * gender
		 * age
		 * birth year
		 * eligibility to drive
		 * eligibility to purchase the car
		 */
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+customerAge);
		System.out.println("Birth Year: "+birthYear);
		
		isEligibleToDrive();
		isPreApproved();
	}
	


}
