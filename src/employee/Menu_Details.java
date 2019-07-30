package employee;

import java.util.Scanner;
//create the class for the menu to run the Employee management program with main method
public class Menu_Details
{
	//It is main method calling the login function by create the object for the Login class
	public static void main(String[] args) throws Exception 
	{
		try
		{
			Scanner scan=new Scanner(System.in);
		Login_Details login=new Login_Details();
		System.out.println("EMPLOYEE MANAGEMENT");
		Login_Details.login();
		Login_Details.verify();
		}
		catch(Exception e)
		{
		try
		{
			Login_Details.login();
			Login_Details.verify();
		}
		catch(Exception f)
		{
		try
		{
			Login_Details.login();
			Login_Details.verify();
		}
		catch(Exception g)
		{
		System.out.println("several times attempted!please wait for 5 minutes and try again");
		Thread.sleep(5000);
		}
		}
		}
		
		}
}