package Assignmentsforloops;

import java.util.ArrayList;

public class ArrayListtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> color=new ArrayList<String>();
		color.add("pink");
		color.add("yellow");
		color.add("null");
		color.add("pink");
		color.add("---");
		color.add("");
		for(String e:color)
		{
			System.out.println(e);
		}
System.out.println("-------------------------");
ArrayList<Integer> m=new ArrayList<Integer>(5);
m.add(0,10);
m.add(1,20);
m.add(2,30);
m.add(3,40);
m.add(4,50);

System.out.println(m.get(0));
System.out.println(m.get(4));

	}

}
