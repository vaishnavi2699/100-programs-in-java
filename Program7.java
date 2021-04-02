// Write a java program to accept a number from user and check whether a number is even or odd.
package LogicalPrograms;

import java.util.Scanner;

public class Program7 
{

	public static void main(String[] args) 
	{
		int num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check even or odd: ");
		num=s.nextInt();
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}

	}

}
