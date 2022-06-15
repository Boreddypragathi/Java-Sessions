package Assignmentsforloops;

public class Company {

	
		// TODO Auto-generated method stub
public void getBrowserInformation(String browserName)
{
	System.out.println("Get broser information:"+browserName);
	if(browserName.equalsIgnoreCase("chrome"))
	{
		System.out.print("hello");
	}
}

public static void main(String[] args) {
	
	Company c=new Company();
	
	c.getBrowserInformation("chrome");
	}

}
