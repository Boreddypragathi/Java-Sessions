package ExceptionHandling;

public class ExceptionHandling1 {
	String Name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("A");
System.out.println("A");
System.out.println("A");
try {
int i=9/3;
ExceptionHandling1 obj=new ExceptionHandling1();
obj=null;
obj.Name="Naveen";
System.out.println("Hi");
System.out.println("Hi");
System.out.println("Hi");
System.out.println("Hi");

}
catch(Exception e)//in which case we have to use throwable,error is the child of throwable class//error means memory issue//
{                                                           //hard ware error//infrastructure error//
	System.out.println("Arithmetic exception is coming");//throwable will handle error and exception
	e.printStackTrace();
}//we should not write error in place of exception
//better write to multiple catch blocks where all the exception related code in try block
//multiple catch blocks with same excepion name is not allowed
//if there are two catch blocks for one catch block if you have written exception for one catch secod catch
System.out.println("Bye");
System.out.println("Bye");
catch(Error e)
{
	System.out.println("for error");
	e.printStackTrace();
}
}

}
