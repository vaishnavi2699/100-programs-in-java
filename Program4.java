// Write a java program to  accept number check whether a number is divisible by 5 and 11 or not.
package LogicalPrograms;

import java.util.Scanner;

public class Program4
{

	public static void main(String[] args)
	{
		int num=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number to find whether the number is divisible by 5 and 11");
        num=s.nextInt();
        if(num%5==0 || num%11==0)
        {
        	System.out.println("Divisible");
        }
        else
        {
        	System.out.println("not divisible");
        }
	}

}
