package employee;
import java.util.Scanner;
public class Login_Details
{
	static String user_name = "Anusha";
	static String pass_word = "0345@";
	static String user_name1;
	static String password1;
	public static void login()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter username");
		user_name1 = scan.nextLine();
		System.out.println("enter password");
		password1 = scan.nextLine();
	}
	public static void verify() throws Exception
	{
		System.out.println(user_name1);
		if (user_name1.equals(user_name) && password1.equals(pass_word)) 
		{
			System.out.println("loggined successfully");
			 Employee_Menu emp = new  Employee_Menu();
			emp.Menu();
		}
		else
		{
			InvalidLoginDetails ild = new InvalidLoginDetails();
			System.out.println(ild.getMessage());
			throw ild;
		}
	}
}
