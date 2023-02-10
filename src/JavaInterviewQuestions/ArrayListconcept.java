package JavaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList : Default class in Java
		// Dynamic Array
		// create the object of ArrayList using new keyword
		// default vc = 10

		ArrayList<String> als = new ArrayList<String>();
		als.add("Ravi");

		ArrayList al = new ArrayList();
		al.add("String");
		al.add(10);
		al.add(true);

		System.out.println(al);
	//	System.out.println("Size of the Arraylist: " + al.size());

		al.add(1, 100);
	//	System.out.println("After update: " + al);

		al.set(2, 200);
	//	System.out.println("Using set method: " + al);
		
	//	System.out.println("using boolean: " +al.contains("String"));
	//	System.out.println("using isempty: "+al.isEmpty());
		
//		for(int i=0; i<al.size(); i++) {
//			System.out.println("Print al the values in Arraylit using for loop: " +al.get(i));
//		}
//		
		
//		for(Object e : al) {
//			System.out.println("Print al the values in Arraylit using foreach loop: " +e);
//		}
//		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		String arr[] = {"Ravi", "Jai", "karthi"};
		for(String value: arr) {
			System.out.println(value);
		}
		
		
		ArrayList al1 = new ArrayList(Arrays.asList(arr));
		System.out.println(al1);
		
		
	}

}
