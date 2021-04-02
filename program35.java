// Write a java program to check whether a number is Armstrong number or not
package LogicalPrograms;

import java.util.Scanner;

public class program35 
{

	public static void main(String[] args)
	{
		int num=0,rem=0,sum=0,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check Armstrong number or not: ");
		num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}

	}

}
