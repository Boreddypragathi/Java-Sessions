package Assignmentsforloops;

import java.util.ArrayList;

public class ArrayListconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//dynamic array
		ArrayList ar=new ArrayList();
		ar.add(100.5);//0
		ar.add(200);//1
		System.out.println(ar.size());
		ar.add(90);//2
		ar.add(true);//lowest index is always 0 3
		System.out.println(ar.size());
		System.out.println(ar);//highest index size-1
		System.out.println("hi:"+ (ar.size()-1));
		System.out.println("-------------");//default virtual capasicity of array list is 10
		System.out.println(ar.get(0));
		//System.out.println(ar.get(5));IOB//by deafult 10 virtual segments will create
		ar.add(80);//4
		System.out.println();//virtual segmnets got created on physical segments/2
		ar.add(5,900);//5
		System.out.println(ar.get(5));//array list is dynamic memory allocation
		ar.add(1,1100);
		System.out.println(ar.get(1));
		ar.remove(1);
		System.out.println(ar.size());
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("--------------------");
	
	for(Object e:ar)
	{
		System.out.println(e);
	}
ArrayList<Integer> Marks=new ArrayList<Integer>();
Marks.add(10);
Marks.add(20);
Marks.add(30);
Marks.add(50);
Marks.add(0);
Marks.add(0);
Marks.add(6,700);
Marks.remove(3);
System.out.println("totalk emements in the marks is:"+Marks);

ArrayList<Integer> list1=new ArrayList<Integer>();
list1.add(10);
list1.add(20);
list1.add(30);
list1.add(50);
list1.listIterator().Marks.addAll(list1);


ArrayList<Object> emp=new ArrayList<Object>();
emp.add("nalini");
emp.add(20);
emp.add(10.9);
emp.addAll(Marks);
emp.add(null);
emp.add(null);
System.out.println(emp);
for(Object e :emp)
{
	System.out.println(e);
}
System.out.println("------------");
for(int c=emp.size()-1;c>=0;c--)
{
System.out.println(emp.get(c));

}
}
}
