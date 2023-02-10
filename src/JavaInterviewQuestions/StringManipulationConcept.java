package JavaInterviewQuestions;

import java.util.Arrays;

public class StringManipulationConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Hi this is my java code";
		
		System.out.println(s.length());
		
		int len = s.length();
		int hi = len-1;
		int li = 0;
		
		System.out.println("LI = " + li);
		System.out.println("length = " + len);
		System.out.println("HI = " + hi);
		
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(0));
		//System.out.println(s.charAt(-1));
		System.out.println(s.charAt(22));
		//System.out.println(s.charAt(23));
		System.out.println(s.charAt(s.length()-1));
		
		System.out.println(s.indexOf('t'));
		System.out.println(s.indexOf('i'));//1st occurrence of i
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		//2nd occurrence of i
		System.out.println(s.indexOf('i', s.indexOf('i')+1),s.indexOf('i')+1)));
		System.out.println(s.indexOf("java"));
		System.out.println(s.indexOf("selenium"));
		
		String mesg = "welcome null";
		System.out.println(mesg.indexOf("admin")>0);
		if(mesg.indexOf("admin") == -1) {
			System.out.println("admin user name is not displayed....");
		}
		else {
			System.out.println("admin is present");
		}

		//trim:
		String s1 = "     hello java      ";
		System.out.println(s1.trim());
		String browser = "     chrome ";
		if(browser.trim().equals("chrome")) {
			System.out.println("launch chrome");
		}
		
		//replace:
		String s2 = "    hello selenium     ";
		System.out.println(s2.replace(" ", ""));
		
		String dob = "01-01-1990"; //01/01/1990
		System.out.println(dob.replace("-", "/"));
		
		//uCase & LCase
		String sc = "hi this is test code";
		System.out.println(sc.toUpperCase());//HI THIS....
		System.out.println(sc.toLowerCase());
		System.out.println(sc.replace("h", "H"));
		
		//contains:
		String st = "welcome to app testing world";
		System.out.println(st.contains("testing"));
		String url = "https://www.amazon.com?search=macbook";
		if(url.contains("search=macbook")) {
			System.out.println("correct url");
		}
		
		//equals:
		String st1 = "Hello Selenium";
		String st2 = "Hello selenium ";
		System.out.println(st1.equals(st2));
		System.out.println(st2.trim().equalsIgnoreCase(st1));
		
		//String literals: SCP
		String t1 = "hello testing";//45454
		String t2 = "hello testing";//45454
		String t3 = "hello Testing";
		//t1 = "java";
		
		//String heap objects
		String t4 = new String("hello java");//2(heap + SCP)
		String t5 = new String("hello java");//1(heap)
		String t6 = "hello java";//0
		
		System.out.println(t1.equals(t2));//true
		System.out.println(t1==t2);//true
		System.out.println(t4==t5);//false
		System.out.println(t4.equals(t5));
		
		System.out.println(t4==t6);
		System.out.println(t4.equals(t6));
		
		String t7 = "hello java";//0
		String t8 = "Hello java";//1
		
		//substring:
		String message = "your transaction id is 12345";
		System.out.println(message.substring(7));
		System.out.println(message.substring(23, message.length()));
		System.out.println(message.substring(message.indexOf("is")+3, message.length()));
		
		//split:
		String data = "Java_Python_Ruby_JavaScript";
		String dataVal[] = data.split("_");
		System.out.println(dataVal.length);
		System.out.println(dataVal[0]);
		System.out.println(Arrays.toString(dataVal));

		String pop = "xXTestingxxXSeleniumXXxXAutomationxXJavaX";
		String p[] = pop.split("xX");
		System.out.println(p[0]);
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);
		//System.out.println(p[5]);
		
		String sr = "testing";
		sr = sr+"automation";
		//System.out.println(sr+"automation");
		System.out.println(sr);
		String si = "testing";
		System.out.println(si);
		
		String empData = "Naveen;testing;bangalore;naveen@gmail.com;90909090;India";
//		System.out.println(empData.split(";")[0]);
//		System.out.println(empData.split(";")[1]);
		String emp[] = empData.split(";");
		for(String e : emp) {
			System.out.println(e);
		}
		
		
		
	}


	}


