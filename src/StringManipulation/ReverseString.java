package StringManipulation;

public class ReverseString {
	public static void reverse(String str)
	{
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			 
		}
		System.out.println(rev);
		
	}    



	public static void main(String[] args) {
		// TODO Auto-generated method stub
reverse("Selinium");
	}
}

//use split function and printn them in the reverse order

//string st="This is my selenium code"
//edoc muineles ym si isht""