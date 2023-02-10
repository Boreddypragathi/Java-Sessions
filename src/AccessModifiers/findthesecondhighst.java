package AccessModifiers;

public class findthesecondhighst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int a[]=new int[]{12,78,78,54,43};
		        for(int i=0;i<a.length;i++)
		        {
		            for(int j=i+1;j<a.length;j++)
		            {
		                if(a[i]<=a[j])
		                {
		                    System.out.println(a[i]-1);
		                }
		            }
		        }
		    }	}


