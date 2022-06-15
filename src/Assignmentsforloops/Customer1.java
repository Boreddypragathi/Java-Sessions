/**
 * 
 */
package Assignmentsforloops;

/**
 * @author Helius
 *
 */
public class Customer1 {
private String Name;
private int age;
private boolean isActive;
//pojo:plain old java object
public Customer1(String Name,int age,boolean isActive)
{
	this.Name=Name;
	this.age=age;
	this.isActive=isActive;
}


public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}

}
