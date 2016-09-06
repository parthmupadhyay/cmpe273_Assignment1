package cmpe273.assignment1.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentEnrollment 
{
	private List<String> courses;
	private String studentName;
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getCourses() {
		return courses;
	}

	public StudentEnrollment(String studentName) 
	{
		this.studentName=studentName;
		this.courses = new ArrayList<String>();
	}
	
	public boolean addCourse(String course)
	{
		if(courses.size()<3)
		{
			if(!courses.contains(course))
			{
				courses.add(course);
				return true;
			}
			else
			{
				System.out.println("Course :"+course+" already enrolled");
				return false;
			}
		}
		else
		{
			System.out.println("Maximun 3 courses allowed");
			return false;
		}
	}
	
	public boolean dropCourse(String course)
	{
		if(courses.contains(course))
		{
			courses.remove(course);
			System.out.println(course+" dropped");
			return true;
		}
		else
		{
			System.out.println("Following course is not registered:"+course);
			return false;
		}
	}

	@Override
	public String toString() {
		return "StudentEnrollment [courses=" + courses.toString() + ", studentName=" + studentName + "]";
	}
	
}
