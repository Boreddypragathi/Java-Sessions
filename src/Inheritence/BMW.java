package Inheritence;

public class BMW extends Car
{
	@Override
public void start()
{
	System.out.println("BMW---start");
	System.out.println("BMW--new implementation done by BMW");
}
public void Autoparking()
{
	System.out.println("BMW-Autoparking");
}
@Override
public void fuelreading()
{
	System.out.println("BMW---fuel reading");
}
public static void getprice()
{
	System.out.println("car getprice");
}
private void info()
{
	System.out.println("BMW--INFO");
}
}
