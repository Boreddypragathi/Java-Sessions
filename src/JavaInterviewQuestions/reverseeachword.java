package JavaInterviewQuestions;

public class reverseeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="welcome to java";
String words[]=s.split("");
String reversestring="";
String reverseword="";
for(String w:words)
{
	for(int i=w.length()-1;i>=0;i--)
	{
//		StringBuilder sb=new StringBuilder();
//		sb.reverse();
		 reverseword=reverseword+w.charAt(i);
	}
     reversestring=reversestring+reverseword+" ";

	}
	
	System.out.println(reversestring);
}

}
