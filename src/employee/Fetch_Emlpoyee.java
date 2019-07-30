package employee;
import java.util.ArrayList;
/** fetch employee class is have the Fetch Employee constructor 
 * And this fetchEmployee class is inherited by the createEmployee class*/
public class Fetch_Emlpoyee extends Create_Employee  {
	// this constructor is implementing the fetching the details of employee based on the employee id 
	public Fetch_Emlpoyee(ArrayList<String[]> employe) 
	{
		if(employe.isEmpty())
		{
			System.out.println("Employee database is empty");
		}
		else 
		{
		System.out.println("Enter the Employee id to find the Employee");
		int Emp_id=sc.nextInt();
		System.out.println("Employ_id\t Employ_name\t Employ_age\t Designation\t Skills\t  \tSalary");
		for(int initial1=0; initial1<employe.size(); initial1++)
			{
				String[] TempEmp=employe.get(initial1);
				if(TempEmp[0].equals(Integer.toString(Emp_id)))
					{
					
					for(String str:TempEmp)
						{
							System.out.printf(str+"\t\t");
						}
			System.out.println();
					}
				
			}
	}
  }
		
}
