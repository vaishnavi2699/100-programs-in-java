//Write a java program to find first and last digit of a number.

package LogicalPrograms;

import java.util.Scanner;

public class program22 
{

	public static void main(String[] args) 
	{
		int num=0,fdigit=0,ldigit=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to find first and last digit: ");
		num=s.nextInt();
		ldigit=num%10;
		while(num!=0)
		{
			fdigit=num%10;
			num=num/10;
		}
		System.out.println("First digit is: "+fdigit);
		System.out.println("Last digit is: "+ldigit);

	}

}
