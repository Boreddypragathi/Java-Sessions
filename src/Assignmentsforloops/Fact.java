package Assignmentsforloops;

public class Fact {
	//int fact=1;
	
	public static int factorial(int n)
	{
		if(n==0)
		return 1;
	else		
		 return (n*factorial(n-1)); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//for(int i=1;i<=number;i++)
//{
//	fact=fact*i;
//}
//
//System.out.println("Factorial for using loop " +number+ " is: " +fact);
		int number=5;
int numb= factorial(number);
System.out.println(numb);

	}

}
