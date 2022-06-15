package Assignmentsforloops;

import java.util.Arrays;

public class Arrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int name[]=new int[10];
		//for(int i=1;i<=10;i++)
		//{
			System.out.println(name);//highest index=lengthh-1=9
			//always lowest index 0
			name[0]=10;
			name[4]=50;
			name[1]=20;
			name[2]=30;
			name[3]=80;
			//System.out.println(name[0]);
			//System.out.println(name[4]);
			//System.out.println(name[11]);AIOB
			//System.out.println(name[4]+name[0]);
			//System.out.println(name[-1]);AIOB
			//System.out.println(name[1]);
			//System.out.println(name[9]);//default value for array element is 0);
			for(int i=0;i<name.length;i++)
			{
				System.out.println(i+ ":"+ (name[i]));
			}
			int c=0;
			for(int e:name)
			{
				System.out.println(c +":"+e);
				c++;
			}
		double d[]=new double[4];
			 d[0]=10.233;
			 d[2]=20.9;
			for(double e:d)
			{
				System.out.println(e);
				System.out.println(Arrays.toString(d));
			}
			for(int k=0;k<d.length;k++)
			{
				System.out.println(d[k]);
				if(d[k]==20.9)
				{
					System.out.println("hi");
				
		
				}
			
			}
			
			
			char ch[]=new char[3];
			ch[0]='a';
			ch[2]='e';
			System.out.println(ch[0]);
			System.out.println(ch[1]);
			System.out.println(ch);//for characters only it display the data
		String[] s=new String[2];
		s[0]="sai";
		s[1]="ram";
		//s[2]="jai";
		/*for(String e:s)
		{
			System.out.println(e);
		}
		System.out.println("------------");
		for(int p=s.length-1;p>=0;p--)
		{
			System.out.println(s[p]);
		}
		int num[]= {1,3,6,8,9};
		*/
		
		
		}
	
	

	}


