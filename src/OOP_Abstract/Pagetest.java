package OOP_Abstract;

public class Pagetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Loginpage lp=new Loginpage(10);
lp.forgotPwd("Ravi");
lp.doLogin("pragathi","ravi");
lp.logo();
lp.header();
lp.title();
lp.url();
lp.pageTimeout();
lp.footer();
//lp.Loginpage();
Page p=new Loginpage();
p.header();
p.url();
p.title();
p.pageTimeout();
p.Page();

	}

}
