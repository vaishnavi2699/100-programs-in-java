// Write a java program to check whether a number is palindrome or not.
package LogicalPrograms;

import java.util.Scanner;

public class program24 
{

	public static void main(String[] args)
	{
		int num=0,rev=0,rem=0,temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check palindrome number or not: ");
		num=s.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not A Palindrome Number");
		}

	}

}
