package Inheritence;

public interface Ushospital extends WHO{
	
	int min_fee=10;//interface variables are final and static in nature by default
public void ENTservices();//you can access using them by interface name
public void Neuroservices();
public void emergencyservices();

//after jdk 1.8 two major changes
//1.can have static metod with method body in  interface
public static void billing()
{
	System.out.println("us permanet billing");
}
//can have one non static default method with method body
default void medicalHistory()
{
	System.out.println("us===medical history");
}
}