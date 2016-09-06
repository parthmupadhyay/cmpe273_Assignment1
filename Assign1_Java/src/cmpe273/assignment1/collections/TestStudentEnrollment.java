package cmpe273.assignment1.collections;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStudentEnrollment 
{

	@Test
	public void testAddCourse() 
	{
		StudentEnrollment test= new StudentEnrollment("testName");
		test.addCourse("CMPE273");
		test.addCourse("CMPE202");
		test.addCourse("CMPE272");
		if(test.addCourse("CMPE281"))
		{
			fail("More than 3 course should not be allowed");
		}
	}
	
	@Test
	public void testDuplicateCourse()
	{
		StudentEnrollment test= new StudentEnrollment("testName");
		test.addCourse("CMPE273");
		if(test.addCourse("CMPE273"))
		{
			fail("Duplicate course added");
		}
	}
	
	@Test
	public void testDropUnenrolledCourse()
	{
		StudentEnrollment test= new StudentEnrollment("testName");
		if(test.dropCourse("CMPE272"))
		{
			fail("Dropping not existig course");
		}
		
	}
	
	@Test
	public void testDropCourse()
	{
		StudentEnrollment test= new StudentEnrollment("testName");
		test.addCourse("CMPE273");
		test.dropCourse("CMPE273");
		if(test.getCourses().contains("CMPE273"))
		{
			fail("Drop course failed");
		}
	}
	
	

}
