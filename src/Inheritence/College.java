package Inheritence;

import Interface.Indiauniversity;
import Interface.UKuniversity;
import Interface.USuniversity;

public class College extends HCU implements USuniversity,UKuniversity,Indiauniversity,WUC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void computerscience() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void artificialintelligence() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mechinelearning() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void robotictechnology() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void electricalengineering() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chemicalengineering() {
		// TODO Auto-generated method stub
		
	}
public void Englishspeaking()
{
	System.out.println("colllege ====english speaking");
}

//method hiding
public static void Usuniversitystudies()
{
	System.out.println("usuniversity");
	
	
}
}
