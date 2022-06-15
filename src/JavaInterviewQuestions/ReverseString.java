package JavaInterviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Pragathi";
		/*int len=s.length();
		System.out.println("length of the string variable"+s.length());
		for(int i=len-1;i>=0;i--)
		{
			String rev="";
			rev=rev+s.charAt(i);
			System.out.print(rev);
		}
		
		
	}

}*/
//using string buffer class
	StringBuffer sb=new StringBuffer(s);
	System.out.println(sb.reverse());
	}
}
	
