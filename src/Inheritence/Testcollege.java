package Inheritence;

import Interface.UKuniversity;
import Interface.USuniversity;

public class Testcollege {
	//int min_fee=20000;//not recomended

	public static void main(String[] args) {
		
		College c=new College();
		c.managerialservices();
		//College c1=new Indiauniversity();
		// TODO Auto-generated method stub
c.robotictechnology();
c.mechinelearning();
c.robotictechnology();
c.artificialintelligence();
c.chemicalengineering();
c.computerscience();
System.out.println(USuniversity.min_fee);
System.out.println(College.min_fee);
UKuniversity uc=new College();
WUC wc=new College();
wc.Englishspeaking();
c.Englishspeaking();
wc.Englishspeaking();
//System.out.println(WUC.Englishspeaking());
uc.computerscience();

	}
	

}
