// Write a java program to check whether a number is Strong number or not.
package LogicalPrograms;

import java.util.Scanner;

public class program38 
{

	public static void main(String[] args) 
	{
		int num=0,temp=0,rem=0,fact=1,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check strong number or not: ");
		num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			while(rem>=1)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			fact=1;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a strong number");
		}

	}

}
