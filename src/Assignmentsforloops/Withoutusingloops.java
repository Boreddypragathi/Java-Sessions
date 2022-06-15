package Assignmentsforloops;

public class Withoutusingloops {

	
		// TODO Auto-generated method stub
static int i;
public static void increment(int a,int b)
{
	if(i<=b)
	{
		System.out.println("value of i:"+ i);
		i++;
		increment(i,b);
	}
	
	
	
}
	
public static void main(String[] args) 
{
	//Withoutusingloops obj=new Withoutusingloops();
	increment(1,5);
}
}

