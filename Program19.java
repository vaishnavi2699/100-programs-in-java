//Write a java program to print all odd number between 1 to 100.
package LogicalPrograms;

import java.util.Scanner;

public class Program19 
{

	public static void main(String[] args) 
	{
		int i=1,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n number: ");
		n=s.nextInt();
		while(i<=n)
		{
			if(i%2!=0)
			{
				System.out.print(i+",");
			}
			i++;
		}

	}

}
