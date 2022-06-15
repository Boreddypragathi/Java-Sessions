package Assignmentsforloops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}

		//Infinite loop
	//	while(true) {
		//	System.out.println("Welcome to TAJ Hotel");
	//	}
		
		int k=1;
		while(k<=100) {
			//System.out.println(k);
			if(k % 2 == 0) {
				System.out.println(k);
			}
			else {
				System.out.println(k);
			}
			k++;
		}
		
		// Print values using For loops
		for(int j=1; j<=10; j++) {
			System.out.println("J value is:" +j);
		}
	}

}
