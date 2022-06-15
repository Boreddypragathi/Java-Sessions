package Assignmentsforloops;

public class Student {
	String Name;
	int sid;
	 String subjects[];
	 
	public Student(String name) {
		Name = name;
	}

	public Student(String name, int sid) {
	
		Name = name;
		this.sid = sid;
	}

	public Student(String name, int sid, String[] subjects) {
		
		Name = name;
		this.sid = sid;
		this.subjects = subjects;
	}
	 

	

}
