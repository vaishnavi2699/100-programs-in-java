// Write a java program to print multiplication table of any number.
package LogicalPrograms;

import java.util.Scanner;

public class program20 
{

	public static void main(String[] args) 
	{
		int num,i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to print multiplication of a table: ");
		num=s.nextInt();
		for(i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+num*i);
		}

	}

}
