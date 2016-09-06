package cmpe273.assignment1.collections;

import java.util.HashMap;

public class StudentRecord 
{
	private HashMap<Long,StudentEnrollment> studentDetails;
	public StudentRecord() 
	{
		this.studentDetails = new HashMap<Long,StudentEnrollment>();
	}

	public StudentEnrollment getStudentEnrollmentDetails(long id) 
	{
		return studentDetails.get(id);
	}

	public void setStudentEnrollmentDetails(long id,StudentEnrollment enrollment) 
	{
		this.studentDetails.put(id, enrollment);
	}
	
	public HashMap<Long,StudentEnrollment> getStudentRecords()
	{
		return this.studentDetails;
	}
	
	public void updateStudentEnrollmentDetails(long id,StudentEnrollment enrollment)
	{
		this.studentDetails.replace(id, enrollment);
	}
}
