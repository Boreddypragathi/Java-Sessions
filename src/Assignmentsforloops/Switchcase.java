package Assignmentsforloops;

public class Switchcase {
	//use cases:
		//RBAC : admin, customer, seller, vendor, distributor
//		String role = "customer";
//		switch (role) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		//env: QA, dev, stage, UAT, prod
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Role="Customer";
		switch(Role)
		{
		case "Custmer":
			System.out.println("customer is happy");
			break;
	

		case "qa":
			System.out.println("qa is happy");
			break;
		case "dev":
			System.out.println("dev is happy");
			break;
		case "stag":
			System.out.println("stag is happy");
			break;
		case "uat":
			System.out.println("qa is happy");
			break;
		case "Prod":
			System.out.println("qa is happy");
			break;
		default :
			System.out.println("All are happy");

}
	}
}
