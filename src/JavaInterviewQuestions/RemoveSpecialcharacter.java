package JavaInterviewQuestions;

public class RemoveSpecialcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="###### Nalini 098765432";
   s=s.replaceAll("[^a-zA-z0-9]","");
   
   System.out.println(s);
  String s1="****&&&&^^^^^$$$$@@@#### hello ravi";
    s1=s1.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(s1);
    String s3="a43u78ffg763";
   String f= s3.replaceAll("[^0-9]","");
    System.out.println(f);
    String input = "abc d 1234567890pqr 54897";

    String digits = input.replaceAll("[^0-9.]","");
    System.out.println(digits);
   
	}
}