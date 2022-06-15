package OOP_Abstract;

public class Amazontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Chromedriver driver=new Chromedriver();
		driver.Url("http://google.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.getUrl("www.facebook.com");
		driver.Sendkeys("email id","admin@gmail.com");
		driver.closeBrowser();
		//WebDriver driver=new Chromedriver();
		String Browser="Chrome";
		System.out.println("browser name is"+ Browser);
		if(Browser.equalsIgnoreCase("Chrome"))
		{
			Webdriver driver=new Chromedriver();
		}
		else if(Browser.equalsIgnoreCase("Safari"))
		{
			Webdriver driver=new Safaridriver();
		}
		else if (Browser.equalsIgnoreCase("Firefox"))
		{
			Webdriver driver=new Firefoxdriver();
			
		}
		else {
			System.out.println("please pass the correct browser"+ Browser);
		}
		
	}
	
	
	
	
	
}
		