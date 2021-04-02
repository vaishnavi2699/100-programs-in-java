 //Write a java program to enter a number and print its reverse.

package LogicalPrograms;

import java.util.Scanner;

public class program27 
{

	public static void main(String[] args) 
	{
		int num=0,rem=0,rev=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to print reverse of its: ");
		num=s.nextInt();
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number is: "+rev);
				
			

	}

}
