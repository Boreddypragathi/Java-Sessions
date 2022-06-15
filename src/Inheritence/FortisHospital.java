package Inheritence;

public class FortisHospital extends Medical implements Ushospital,UKhospital {
	
	@Override//always use extends  only implement
	public void ENTservices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Neuroservices() {
		// TODO Auto-generated method stub
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void physio() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cardioservices() {
		// TODO Auto-generated method stub
		//individual methods
	}
		public void medicalTraining() {
			System.out.println("FH--Medical trainig");
		}

		@Override
		public void emergencyservices() {
			// TODO Auto-generated method stub
			
		}
		//nerated method stub
		
		public static void billing()
		{
			System.out.println("fortis hospital billing");
		}
		
//default method overriding
public void medicalHistory()//child class can ovverride using public keyword
{
	System.out.println("FH-mmedical history");
}

@Override
public void covid19() {
	// TODO Auto-generated method stub
	
}
}
		
	

