// Write a java program to count number of digits in a number.
package LogicalPrograms;

import java.util.Scanner;

public class program21 
{

	public static void main(String[] args) 
	{
	   int num=0,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number to count number of digits: ");
        num=s.nextInt();
        while(num!=0)
        {
        num=num/10;
        count++;
        }
        System.out.println("Number of digits: "+count);
	}

}
