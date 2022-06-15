package Assignmentsforloops;

public class Employee {

	String name;
	 int age;
	 String city;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Create the 5 different objects
		//u1=u2,u2=u3,u3=u4,u4=u1
		 
		Employee u1=new Employee();
		u1.name="Sai";
		u1.age=20;
		u1.city="hyd";
		System.out.println(u1.name + "   " + u1.age + " " + u1.city);
		Employee u2=new Employee();
		u2.name="Karthi";
		u2.age=6;
		u2.city="bang";
		System.out.println(u2.name + "   " + u2.age + " " + u2.city);
		Employee u3=new Employee();
		u3.name="ravi";
		u3.age=32;
		u3.city="chennai";
		System.out.println(u3.name + "   " + u3.age + " " + u3.city);
		Employee u4=new Employee();
		u4.name="pragathi";
		u4.age=32;
		u4.city="kkl";
		System.out.println(u4.name  + "   " + u4.age + " " + u4.city);
		System.out.println("-----------------");
		u1=u2;
		System.out.println(u1.name + "   " + u1.age + " " + u1.city);
		u2=u3;
		System.out.println("-----------------");
		System.out.println(u2.name + "   " + u2.age + " " + u2.city);
		u3=u4;
		System.out.println("-----------------");
		System.out.println(u3.name + "   " + u3.age + " " + u3.city);
		u4=u1;
		System.out.println("-----------------");
		System.out.println(u4.name  + "   " + u4.age + " " + u4.city);
		
		
				
		
		
	}

}
