package Assignmentsforloops;
import java.util.ArrayList;
import java.util.Arrays;

public class Emptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorconcept  et=new Constructorconcept("Naveen");
		System.out.println(et.name);
		System.out.println(et.age);
		Constructorconcept  et1=new Constructorconcept("Naveen",30);
		System.out.println(et1.name);
		System.out.println(et1.age);
		Loginpage lp=new Loginpage("pragathi","karthi@123");
		lp.dologin();
		ArrayList<String> shikalist=new ArrayList<String>();
		shikalist.add("ICICI123");
		shikalist.add("HDFC2345");
		shikalist.add("DBS234");
		
		Customernew cn=new Customernew("rani",30,"987","dfyui","hyd",true,shikalist);
		System.out.println(cn.Name+"        "+cn.age+"        "+cn.cardlist);
		
		
		Student s=new Student("Pragathi");
		System.out.println(s.Name);
		String subject[]= {"Maths","english","hindi","social"};
		Student s1=new Student("Pragathi",34,subject);
		System.out.println(s1.Name+"     "+Arrays.toString(subject));
		Users u1=new Users();
	}

}
