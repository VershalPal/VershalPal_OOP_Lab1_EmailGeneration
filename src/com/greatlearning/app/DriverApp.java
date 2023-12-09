package com.greatlearning.app;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.EmployeeServiceImple;

public class DriverApp {

	public static void main(String[] args)
	{
		EmployeeServiceImple empImple=new EmployeeServiceImple();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your First Name :");
		String firstName=sc.next();
		System.out.println("Please enter your Last Name :");
		String lastName=sc.next();
		
		System.out.println("\nPlease enter the Department from the following :");
		System.out.println("1.) Technical");
		System.out.println("2.) Admin");
		System.out.println("3.) Human Resource");
		System.out.println("4.) Legal");
		
		int choice=sc.nextInt();
		
		String genEmail="";
		String genPassword="";
		
		switch(choice)
		{
			case 1: genEmail=empImple.generateEmailId(firstName.toLowerCase(), lastName.toLowerCase(), "tech"); break;
			case 2: genEmail=empImple.generateEmailId(firstName.toLowerCase(), lastName.toLowerCase(), "adm"); break;
			case 3: genEmail=empImple.generateEmailId(firstName.toLowerCase(), lastName.toLowerCase(), "hr"); break;
			case 4: genEmail=empImple.generateEmailId(firstName.toLowerCase(), lastName.toLowerCase(), "legal"); break;
			default : System.out.println("\nPlease enter the Valid Input!");
		}
				
		genPassword=empImple.generatePassword();
		
		Employee e1=new Employee();
		e1.setFirstName(firstName);
		e1.setLastName(lastName);
		e1.setEmail(genEmail);
		e1.setPassword(genPassword);
		
		empImple.showEmployeeDetails(e1);
	}
}