package employee;
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
//create the employee with the personal and professional details
public class Create_Employee 
{
	// declare the variables for the Employee to store the Employee details
	protected int Employee_Id;
	private int age;
	private String Employee_Name;
	private String Designation;
	private String Skills;
	private int Salary;
	Scanner sc = new Scanner(System.in);
	// Initial init=new CreateEmployee();
	ArrayList<String[]> Employee_Db = new ArrayList<String[]>(100);
	public ArrayList<String[]> PersonalDetails()
	{
		System.out.println("Enter the Professional & Personal Details of Employee:");
		String[] Employee = new String[6];
		// for loop for the get the user input in runtime and stored in String Array
		for (int initial = 0; initial < Employee.length; initial++)
		{
			if (initial == 0)
			{
				System.out.println("Enter the Employee_id:");
				Employee_Id = sc.nextInt();
				Employee[initial] = Integer.toString(Employee_Id);
			}
			if (initial == 1) 
			{
				System.out.println("Enter the Employee_name:");
				Employee_Name = sc.next();
				Employee[initial] = Employee_Name;
			}
			if (initial == 2)
			{
				System.out.println("Enter the Employee_age:");
				age = sc.nextInt();
				Employee[initial] = Integer.toString(age);
			}
			if (initial == 3)
			{
				System.out.println("Enter the Designation:");
				Designation = sc.next();
				Employee[initial] = Designation;
			}
			if (initial == 4) 
			{
				System.out.println("Enter the Skills of Employee:");
				Skills = sc.next();
				Employee[initial] = Skills;
			}
			if (initial == 5)
			{
				System.out.println("Enter the Salary of Employee:");
				Salary = sc.nextInt();
				Employee[initial] = Integer.toString(Salary);
			}
		}
		Employee_Db.add(Employee);
		System.out.println("Employee Details Sucessfully Completed");
		return Employee_Db;
		
	}
}
