//Write a java program to calculate sum of digits of a number.
package LogicalPrograms;

import java.util.Scanner;

public class program25 
{

	public static void main(String[] args) 
	{
		int i=0,num=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to find sum of digits: ");
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum is: "+sum);

	}

}
