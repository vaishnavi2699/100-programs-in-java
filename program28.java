// Write a java program to find all factors of a number
package LogicalPrograms;

import java.util.Scanner;

public class program28 {

	public static void main(String[] args) 
	{
		int i=1,num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to find all factors: ");
		num=s.nextInt();
		for(i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				System.out.println("Factors are: "+i);
			}
		}

	}

}
