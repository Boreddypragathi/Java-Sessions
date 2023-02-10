package JavaInterviewQuestions;

import java.util.Scanner;

public class Reerseofastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String org_str=sc.next();
		String rev="";
		int len=org_str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+org_str.charAt(i);
		}
			System.out.println(rev);
		
if(rev==org_str)
{
	System.out.println("it is palindrome string");
}
else
{
	System.out.println("it is not palindrome string");
}
	}

}
