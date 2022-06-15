package Assignmentsforloops;

public class Customer {
	
	 public void sum()
	    {
	    int a=10;
	    int b=20;
	    int c=a+b;
		//return c;
	    System.out.print(c);
	    }
	 public void testing()
	 {
		 System.out.println("this is my testing");
	 }
	 public int getMarks()
	 {
		 System.out.println("Get marks");
		 int bonus=100;
		 int marks=50;
		 int totalmarks=bonus+marks;
		 System.out.println(totalmarks);
		 return totalmarks;
	 }
	 public String getName()
	 {
		 String name="prgatanamehi";
		 System.out.println(name);
		 return name;
	 }
	 public char getChar()
	 {
		 char c='a';
		return c;
		 
	 }
	 public int add(int a,int b)
	 {
		 System.out.println("addition using params");
		 int z=a+b;
		 return z;
	 }
	 public int getStudentMarks(String studentname)
	 {
		 int marks=1000;
		
		 System.out.println("get marks for student name:"+studentname);
		if(studentname.equals("vani"))
				{
			marks= 90;
		}
		else if(studentname.equals("Ravi"))
		{
			marks=100;
		}
		else
		{
			System.out.println("please pass the valid student name:"+studentname);
		}
	 return marks;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer s=new Customer();
		
		s.sum();
		//System.out.print(c);
		s.testing();
		int m=s.getMarks();
		String str=s.getName();
		s.getChar();
	int j=s.add(20, 30);
	System.out.println(j);
	int j1=s.getStudentMarks("tom");
	System.out.println(j1);
   
	}

}
