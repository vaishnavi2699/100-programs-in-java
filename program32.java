// Write a java program to check whether a number is Prime number or not
package LogicalPrograms;

import java.util.Scanner;

public class program32 
{

	public static void main(String[] args) 
	{
		int i=0,num=0,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check prime number or not: ");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}

	}

}
