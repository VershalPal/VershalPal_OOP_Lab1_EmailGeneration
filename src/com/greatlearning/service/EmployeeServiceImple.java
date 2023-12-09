package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImple implements EmployeeService
{

	@Override
	public String generateEmailId(String firstName, String lastName, String deptName)
	{
		return firstName+lastName+"."+deptName+"@greatlearning.com";
	}

	@Override
	public String generatePassword()
	{
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower="abcdefghijklmnopqrstuvwxyz";
		String nums="0123456789";
		String splchars="!@#$%^&*()";
		String combined=caps+lower+nums+splchars;
		
		String myPassword="";
		
		Random random=new Random();
									//random.nextInt(72);
		for (int i=1;i<=8;i++)
		{
			myPassword=myPassword+String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}
		
		return myPassword;
	}

	@Override
	public void showEmployeeDetails(Employee e)
	{
		System.out.println("\nEmployee's Details are as follows :");
		System.out.println("First Name : "+e.getFirstName());
		System.out.println("Last Name : "+e.getLastName());
		System.out.println("Generated Email address : "+e.getEmail());
		System.out.println("Generated Password : "+e.getPassword());
	}
}