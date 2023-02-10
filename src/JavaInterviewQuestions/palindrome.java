package JavaInterviewQuestions;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		int rev=0;
		// TODO Auto-generated method stub
//Scanner sc=new Scanner(System.in);
//System.out.println("Please enter a number");
//int num=sc.nextInt();
		
		int num = 1234;

while(num!=0)
{
	rev=rev*10 + num%10;
	num=num/10;
}
	if(num==rev)
	{
		System.out.println("Its a palindrome number");
	}
else
{
	System.out.println("Its not a palindrome number");
}

	}
}

