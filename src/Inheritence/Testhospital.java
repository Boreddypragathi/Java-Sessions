package Inheritence;

public class Testhospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FortisHospital fh=new FortisHospital();

fh.physio();
 fh.cardioservices();
 fh.emergencyservices();
 fh.ENTservices();
 fh. Neuroservices();
 fh.emergencyservices();
 System.out.println(Ushospital.min_fee);
 System.out.println(FortisHospital.min_fee);
 
 UKhospital uk=new FortisHospital();//child class object can be referred by parent class object
 uk.cardioservices();
 uk.emergencyservices();
 //uk.Neuroservices();
 fh.medicalHistory();
 fh.covid19();
 uk.covid19();
 //world wide university classes//some course
 //Assignments
 //create university interface
 //us univercity ,uk university,european university//cources will provide
 //college class
	}

}
