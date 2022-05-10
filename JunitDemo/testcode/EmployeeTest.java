package testcode;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import businesscode.Employee;

public class EmployeeTest 
{
	Employee emp;
	
	@Before
	public void setUp() throws Exception 
	{
		emp = new Employee(101,"Mani",15000);
	}

	@After
	public void tearDown() throws Exception 
	{
		emp = null;
	}

	@Test
	public void testGetEmpNameWithHighestSalary() 
	{
		String expectedName = "Mani";
		assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
		
	}

	@Test
	public void testGetHighestPaidEmployee() 
	{
		assertEquals(emp,Employee.getHighestPaidEmployee());
	}

}
