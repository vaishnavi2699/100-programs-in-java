// Write a java program to count total number of notes in given amount.           //2000,500,100,50
package LogicalPrograms;

import java.util.Scanner;

public class Program11 
{

	public static void main(String[] args) 
	{
		int amt,a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Amount to print number of notes: ");
		amt=s.nextInt();
		if(amt%50==0)
		{
			if(amt>=2000)
			{
				a=amt/2000;
				amt=amt-(a*2000);
				System.out.println("2000 rupees notes are: "+a);
			}
			if(amt>=500)
			{
				b=amt/500;
				amt=amt-(b*500);
				System.out.println("500 rupees notes are: "+b);
			}
			 if(amt>=100)
			{
				c=amt/100;
				amt=amt-(c*100);
				System.out.println("100 rupees notes are: "+c);
			}
			 if(amt>=50)
			{
				d=amt/50;
				amt=amt-(d*50);
				System.out.println("50 rupees notes are: "+d);
			}
		}
		else
		{
			System.out.println("Invalid amount");
		}

	}

}
