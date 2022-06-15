package Assignmentsforloops;
import java.util.ArrayList;

public class Encapsulationemp {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		encapsulation  ee=new encapsulation ();
		ee.setName("Ravi");
		ee.setAge(34);
		ee.setCity("hyd");
		
		Usernew un=new Usernew();
		un.username="Ravi";
		un.age=80;
		un.setSalary(1234.67);;
		ArrayList<String> devicelist=new ArrayList<String>();
		devicelist.add("Macbook");
		devicelist.add("I phone");
		un.setDevicesist(devicelist);
		System.out.println(un.username+""+un.age+""+un.getSalary()+""+un.getDevicesist());
		Login  l=new Login();
		l.setName("sony");
		l.setPassword("pragathi");
		
		l.dologin(l.getName(),l.getPassword());
		Browser b=new Browser();
		b.launchchrome();
		Customer1 c1=new Customer1("Ravi",30,true);//post call
		System.out.println(c1.getAge()+""+c1.getName()+""+c1.isActive());
		c1.setName("garima");//put call
		c1.setAge(39);
		c1.setActive(true);
		System.out.println(c1.getAge()+""+c1.getName()+""+c1.isActive());//get data
		
	}
	
}
	
