package OOP_Abstract;

public class Loginpage extends Page {
public Loginpage()
{
	System.out.println("login page");
}
public  Loginpage(int a)
{
	System.out.println("value of a is"+a);
}
	@Override
	public void title() {
		// TODO Auto-generated method stub
		System.out.println("Amazon--login");
	}

	@Override
	public void header() {
		// TODO Auto-generated method stub
		System.out.println("Amazon--header");
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		System.out.println("Amazon---url");
	}
	@Override
	public void pageTimeout()
	{
		System.out.println("Page time out---10 sec");
	}
	public void doLogin(String un,String pwd)
	{
		System.out.println("login with:"+ un +":"+ pwd);
	}
	public void forgotPwd(String pwd)
	{
		System.out.println("forgot pwd"+pwd);
	}
}


