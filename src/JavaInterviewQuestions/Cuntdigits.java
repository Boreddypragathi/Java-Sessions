package JavaInterviewQuestions;

public class Cuntdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1234;
int count=0;
int sum=0;
while(num!=0)
{
	sum=sum+num%10;
	num=num/10;
	count++;
}
System.out.println(sum);
System.out.println(count);

	}

}
