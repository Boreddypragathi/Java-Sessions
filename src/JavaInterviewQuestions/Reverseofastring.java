package JavaInterviewQuestions;

public class Reverseofastring {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//String Name="PRAGATHI";
//int strlength=Name.length();
//String rev="";
//for(int i=strlength-1;i>=0;i--)
//{
//	 rev=rev+Name.charAt(i);
//	
//}
//System.out.println(rev);
//	}
//
String Name="Jai";
String rev="";
		char s[]=Name.toCharArray();
		int len=s.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s[i];
		}
		System.out.println(rev);
	}
}
		
//}
