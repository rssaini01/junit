package com.demo.learn.junit;

import org.junit.Test;

import com.demo.learn.junit.sample.EmpBusinessLogic;
import com.demo.learn.junit.sample.EmployeeDetails;

import static org.junit.Assert.assertEquals;

public class TestEmployeeDetails {
	private EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	private EmployeeDetails employee = new EmployeeDetails();

	// test to check appraisal
	@Test
	public void testCalculateAppriasal() {
		employee.setName("Ravi");
		employee.setAge(25);
		employee.setMonthlySalary(8000);

		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}

	// test to check yearly salary
	@Test
	public void testCalculateYearlySalary() {
		employee.setName("Ravi");
		employee.setAge(25);
		employee.setMonthlySalary(8000);

		double salary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.0);
	}
}