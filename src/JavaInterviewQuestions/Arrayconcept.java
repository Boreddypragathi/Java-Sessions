package JavaInterviewQuestions;

public class Arrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i[]=new int[5];
          i[0]=10;
          i[2]=20;
          i[3]=30;
          i[4]=40;
          //lowset index=0,highest index=99,length=highestindex+1;
          for(int k=0;k<i.length;k++)
          {
        	  System.out.println(i[k]);
          }
          
          
          System.out.println("===============");
          
          for(int e : i)
          {
        	  int c = 0;
        	  System.out.println(c+ "" +e);
        	  c++;
          }
          
          
          
	}
	
	
	
	
	
	
	

}
