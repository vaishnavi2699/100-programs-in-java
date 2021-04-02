// Write a java program to accept values from user and print maximum value between two numbers.
package LogicalPrograms;

import java.util.Scanner;

public  class Program1
{

	public static void main(String[] args)
	{
		int num1=0,num2=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers to find maximum between two numbers: ");
		num1=s.nextInt();
		num2=s.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is greatest: "+num1);
		}
		else
		{
			System.out.println("num2 is greatest: "+num2
		}
		
		

	}

}
