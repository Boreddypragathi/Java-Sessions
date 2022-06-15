package ExceptionHandling;

public class ThrowsKeyword {

	public void m1()
	{
		m2();
	}
	public void m2()
	{
		
		try {
			m3();
		}
			catch(ArithmeticException e)
		{
		e.printStackTrace();
	}
	}
		public void m3()throws ArithmeticException//never handle the exception in main method
		//if you are handling the exception using try and catch no need of writimg the throws Arithmetic exception
		//by using throws keyword we will throwing(passing) the exception to one method to another method
	{
		int i=9/0;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.m1();
		System.out.println("bye");
	}

}
