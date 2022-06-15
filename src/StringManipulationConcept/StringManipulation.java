package StringManipulationConcept;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="This is my java code";
   int l =s.length();
   System.out.println("length of the string is +:"+ l);
    int hi=l-1;
    int lo=0;
    System.out.println("highest index is"+hi);
    System.out.println("lowst index is +"+lo);
    System.out.println(s.charAt(6));//no concept of negative index
    //System.out.println(s.charAt(-1));
    System.out.println(s.charAt(s.length()-1));
    System.out.print(s.indexOf("i"));
    
	}

}
