package employee;
public class InvalidLoginDetails extends Exception
{
public String getMessage()
{
return "invalid login details!Try again";
}
}
