package Assignmentsforloops;

public class encapsulation {
private String name;
private int age;
private String city;
//private methods/variables can be accessed by public methods
//getter and setter methids

public String getEmpdata()
{
	return name+""+age+""+city;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}





}


