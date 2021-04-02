// Write a java program to find sum of first and last digit of a number.
package LogicalPrograms;

import java.util.Scanner;

public class program23 {

	public static void main(String[] args)
	{
		int num=0,sum=0,fdigit=0,ldigit=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to find sum of fdigit and ldigit: ");
		num=s.nextInt();
		ldigit=num%10;
		while(num!=0)
		{
			fdigit=num%10;
			num=num/10;
		}
		sum=fdigit+ldigit;
		System.out.println("first digit is: "+fdigit);
		System.out.println("last digit is: "+ldigit);
		System.out.println("sum of first and last digit: "+sum);

	}

}
