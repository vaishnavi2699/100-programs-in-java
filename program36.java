//Write a java  program to check whether a number is Perfect number or not.
package LogicalPrograms;

import java.util.Scanner;

public class program36 
{

	public static void main(String[] args) 
	{
		int num=0,i=0,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number to check perfect number or not: ");
		num=s.nextInt();
		for(i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("sum is: "+sum);
        if(sum==num)
        {
        	System.out.println("perfect number");
        }
        else
        {
        	System.out.println("Not a perfect number");
        }
	}

}
