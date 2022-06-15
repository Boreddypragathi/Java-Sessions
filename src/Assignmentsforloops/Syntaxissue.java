package Assignmentsforloops;

public class Syntaxissue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 400;
		int y = 600;
		int z = 200;
		
		if(x>y && x>z) {//false && true = false
			System.out.println("x is the greatest");
		}
		else if(y>z) {//false
			System.out.println("y is the greatest");
		}
		else {
			System.out.println("z is the greatest");
		}
		
		
	}
	

}
