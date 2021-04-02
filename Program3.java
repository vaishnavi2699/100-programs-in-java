// Write a java program to  accept values from user and check whether a number is negative, positive or zero.
package LogicalPrograms;

import java.util.Scanner;

public class Program3 
{

	public static void main(String[] args)
	{
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to print number is zero or postive or negative ");
        num=s.nextInt();
        if(num==0)
        {
        	System.out.println("Zero");
        }
        else if(num>0)
        {
        	System.out.println("Postive number");
        }
        else
        {
        	System.out.println("Negative number");
        }
	}

}
