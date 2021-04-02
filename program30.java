//Write a java program to calculate factorial of a number.
package LogicalPrograms;

import java.util.Scanner;

public class program30 {

	public static void main(String[] args) 
	{
		 int i=1,num=0,fact=1;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter Number: ");
		 num=s.nextInt();
		 for(i=1;i<=num;i++)
		 {
			 fact=fact*i;
		 }
		 System.out.println("Factorial is: "+fact);

	}

}
