package Assignmentsforloops;

public class Login {
private String Name;
private String password;


public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public void dologin(String Name,String password)
{
	System.out.println("user name:"+Name);
	System.out.println("password name:"+password);
	System.out.println("user logged in successfully");
}
}
