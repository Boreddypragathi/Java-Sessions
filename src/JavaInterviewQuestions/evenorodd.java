package JavaInterviewQuestions;

public class evenorodd {

	public static void main(String[] args)
	{
		int even_count=0;
		int odd_count=0;
		
		int num=1234;
		int count=0;
		int remainder;
		while(num!=0)
		{
			remainder=num%10;
		
		if(remainder%2==0)
		{
			even_count++;
			
			
		}
		
		else
		{
			
			odd_count++;
			
		}
		
		num=num/10;
		}
		System.out.println(odd_count);
		System.out.println(even_count);
		}
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
