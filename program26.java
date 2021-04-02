// Write a java program to calculate product of digits of a number.
package LogicalPrograms;

import java.util.Scanner;

public class program26 
{

	public static void main(String[] args) 
	{
	int num=0,i=1,fact=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number to find product of digits: ");
    num=s.nextInt();
    for(i=1;i<=num;num--)
    {
    	fact=fact*num;
    }
   
    System.out.println("product of digits is: "+fact);
	}

}
