// Write a java program to accept values from user and print maximum value between three numbers.
package LogicalPrograms;

import java.util.Scanner;

public class Program2 
{

	public static void main(String[] args) 
	{
		int num1=0,num2=0,num3=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers to find maximum number: ");
		num1=s.nextInt();
		num2=s.nextInt();
		num3=s.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is greatest: "+num1);
		}
		else if(num2>num3)
		{
			System.out.println("num2 is greatest: "+num2);
		}
		else
		{
			System.out.println("num3 is greatest: "+num3);
		}

	}

}
