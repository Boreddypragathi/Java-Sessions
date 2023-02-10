package JavaInterviewQuestions;

public class realtimeusecaseswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//RBAC : admin, customer, seller, vendor, distributor
String Role="customer";
switch (Role) {
case "admin":
	System.out.println("I am admin");
	break;
case "seller":
	System.out.println("I am seller");
	break;
case "vendor":
	System.out.println("I am vendor");
	break;
case "distributor":
	System.out.println("I am distributor");
	break;
case "customer":
	System.out.println("I am customer");
	break;
default:
	System.out.println("Please pass the correct user Role");
	break;
}
	}

}
