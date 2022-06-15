package Assignmentsforloops;

public class Loginpage {
	
	String Username;
	String Password;
	public Loginpage(String Username,String Password)
	{
		this.Username=Username;
		this.Password=Password;
	}
	public boolean dologin()
	{
		System.out.println("Enter usernmae:"+Username);
		System.out.println("Enter Password:"+Password);
		System.out.println("login successfully");
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
