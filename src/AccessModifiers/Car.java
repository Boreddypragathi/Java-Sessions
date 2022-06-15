package AccessModifiers;

public class Car {
	
	public void running()
	{
		
		System.out.println("iam running i am public method");
	}
	private void paying()
	{
		System.out.println("i am paying private method");
	}
	protected void checking()
	{
		System.out.println("iam checking from protected method");
	}
	void cycling() {
		System.out.println("iam default cycling method ");
	}
	
	
	public String Name;
	private int price;
	protected String color;
	int platenumber;//no default keyword is designed for interfaces if nothing written it is default

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car c=new Car();

		
		
	}

}
