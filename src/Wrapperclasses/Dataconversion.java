package Wrapperclasses;

public class Dataconversion {

	public Dataconversion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Integer.MIN_VALUE);
System.out.println(Integer.MAX_VALUE);
System.out.println(Short.MIN_VALUE);
System.out.println(Short.MAX_VALUE);
String s="100";
System.out.println(s);
int i=Integer.parseInt(s);
System.out.println(i+20);
String y="100a";
String y1=y.split("a")[0];
System.out.println(y1);
int h=Integer.parseInt(y1);
System.out.println(h+20);
String p="12.33";
System.out.println(p+20);
double d=Double.parseDouble(p);
System.out.println(p+20);
String remote="true";




	}

}
