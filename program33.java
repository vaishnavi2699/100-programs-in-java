//Write a java program to find sum of all prime numbers between 1 to n
package LogicalPrograms;

import java.util.Scanner;

public class program33 
{

	public static void main(String[] args) 
	{
		int num=0,i=0,j=0,count=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+i;
			}
			count=0;
		}
		System.out.println("Sum of primenumbers are: "+sum);

	}

}
