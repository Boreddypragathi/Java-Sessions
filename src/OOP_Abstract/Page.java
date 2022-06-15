package OOP_Abstract;

public abstract class Page {
public abstract void title();
public abstract void header();
public abstract void url();
public void pageTimeout()//partial abstarction
//100% abstarcation
//0% abstarction
//we can not create the object for page class,we need to create the object for child class
{
	System.out.println("Page time out---20 sec");
}
public void footer()
{
	System.out.println("page footer");
}
public final void logo()
{
	System.out.println("logo--page");
	
}
public void Page()
{
	System.out.println("page class constructor");
}
public void page(int a)
{
	System.out.println("single parameter"+a);
}
}
