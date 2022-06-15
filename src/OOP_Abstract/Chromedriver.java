package OOP_Abstract;

public class Chromedriver implements Webdriver {
public Chromedriver()
{
	System.out.println("chrome driver");
}
	@Override
	public void Url(String url) {
		// TODO Auto-generated method stub
		System.out.println("launch google chrome"+url);
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "hello world";
	}

	@Override
	public String getUrl(String url) {
		// TODO Auto-generated method stub
		return "some url";
	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Sendkeys(String element, String value) {
		// TODO Auto-generated method stub
	System.out.println("entering the value:"+value+"to:"+element);	
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		
	}

}
