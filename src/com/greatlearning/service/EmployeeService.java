package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface EmployeeService
{
	String generateEmailId (String fName, String lName, String deptName);
	String generatePassword();
	void showEmployeeDetails(Employee e);
}