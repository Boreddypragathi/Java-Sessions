package JavaInterviewQuestions;

public class RemoveSpecialcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="###### Nalini 098765432";
   s=s.replaceAll("[^a-zA-z0-9]","");
   System.out.println(s);
  String s1="****&&&&^^^^^$$$$@@@#### hello ravi";
    s1=s1.replaceAll("[^a-zA-Z0-9]","a");
    System.out.println(s1);
    
   
	}
}
