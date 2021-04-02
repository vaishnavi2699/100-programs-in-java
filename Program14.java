 //Write a java program to print all natural numbers from 1 to n. - using while loop
package LogicalPrograms;

import java.util.Scanner;

public class Program14 
{

	public static void main(String[] args) 
	{
		int i=1,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n number: ");
		n=s.nextInt();
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}

	}

}
