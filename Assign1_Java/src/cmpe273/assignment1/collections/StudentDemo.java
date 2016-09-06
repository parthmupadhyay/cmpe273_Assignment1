package cmpe273.assignment1.collections;

import java.util.Scanner;

public class StudentDemo 
{
	public static void main(String[] args)
	{
		StudentRecord record = new StudentRecord();
		boolean flag=true;
		do
		{	
			System.out.println("Choose from below");
			System.out.println("1.Add student");
			System.out.println("2.Add course");
			System.out.println("3.Drop course");
			System.out.println("4.View courses enrolled");
			System.out.println("5.Show all students enrollment");
			System.out.println("6.Exit");
			Scanner scanner = new Scanner(System.in);
			Scanner scanner2 = new Scanner(System.in);
			int choice=scanner.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter name");
					String name=scanner2.nextLine();
					System.out.println("Enter student id");
					long id=scanner2.nextLong();
					StudentEnrollment newStudent= new StudentEnrollment(name);
					record.setStudentEnrollmentDetails(id, newStudent);
					break;
				}
				case 2:
				{
					System.out.println("Enter student id");
					long id= scanner2.nextLong();
					scanner2.nextLine();
					StudentEnrollment enrollment=record.getStudentEnrollmentDetails(id);
					System.out.println("Add course");
					enrollment.addCourse(scanner2.nextLine());
					record.updateStudentEnrollmentDetails(id, enrollment);
					break;
				}
				case 3:
				{
					System.out.println("Enter student id");
					long id= scanner2.nextLong();
					scanner2.nextLine();
					StudentEnrollment enrollment=record.getStudentEnrollmentDetails(id);
					System.out.println("Enter course name to drop");
					enrollment.dropCourse(scanner2.nextLine());
					record.updateStudentEnrollmentDetails(id, enrollment);
					break;
				}
				case 4:
				{
					System.out.println("Enter student id");
					long id= scanner2.nextLong();
					StudentEnrollment enrollment=record.getStudentEnrollmentDetails(id);
					System.out.println(enrollment.toString());
					break;
				}
				case 5:
				{
					System.out.println(record.getStudentRecords().toString());
					break;
				}
				case 6:
				{
					flag=false;
					break;
				}
				default:
				{
					System.out.println("Enter choices from 1-6");
					break;
				}
			}
			scanner.close();
			scanner2.close();
		}while(flag);
	}
}
