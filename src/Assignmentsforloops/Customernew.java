package Assignmentsforloops;

import java.util.ArrayList;
import java.util.Arrays;

public class Customernew {
	
	String Name;
	int age;
	String dob;
	String phone;
	String city;
	boolean isActive;
	ArrayList<String> cardlist;
	

	public Customernew(String name, int age) {
		
		Name = name;
		this.age = age;
		
	}
	
	


	public Customernew(String name, int age, String dob) {
		
		Name = name;
		this.age = age;
		this.dob = dob;
	}





	public Customernew(String name, int age, String dob, String phone, String city, boolean isActive,
			ArrayList<String> cardlist) {
		super();
		Name = name;
		this.age = age;
		this.dob = dob;
		this.phone = phone;
		this.city = city;
		this.isActive = isActive;
		this.cardlist = cardlist;
	}




	public Customernew(String name, String dob, String city, boolean isActive) {
		
		Name = name;
		this.dob = dob;
		this.city = city;
		this.isActive = isActive;
	}




	

}
