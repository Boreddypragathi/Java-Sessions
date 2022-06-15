package Assignmentsforloops;

public class Constructorconcept 

{
	String name;
	int age;
	String City;
	boolean isActive;
	
	public Constructorconcept()
	{
		System.out.println("default constructor");
	}
public Constructorconcept(String name)
{
	this.name=name;
}
public Constructorconcept(String name,int age)
{
	this.name=name;
	this.age=age;
}


	public Constructorconcept(String name, int age, String city, boolean isActive) {
	
	this.name = name;
	this.age = age;
	City = city;
	this.isActive = isActive;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
	

	}

}
