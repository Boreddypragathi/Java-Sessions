package ExceptionHandling;

public class Finallyblock {
	public static int getmarks(String name)
	{
		System.out.println("student name"+name);
		if(name.equals("jaya"))
		{
			return 90;
		}
		else 
		{
			System.out.println("please pass the correct user name"+name);
			return 100;
		}
		//incase of system.exit(1) only system will not execute the finally block
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hi");
//int i=9/0;
try
{
	int i=9/3;
}
catch(ArithmeticException e)
{
	e.printStackTrace();
}
finally
{
	System.out.println("this is finally block");//in programme exception is coming or not finally block will exceute
}
	}

}
