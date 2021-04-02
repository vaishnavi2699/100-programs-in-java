//Write a java program to print all natural numbers in reverse (from n to 1)
package LogicalPrograms;

import java.util.Scanner;

public class Program15 
{

	public static void main(String[] args)
	{
       int i=1,n;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter n number: ");
       n=s.nextInt();
       System.out.println("Even numbers are: ");
       while(i<=n)
       {
    	   if(i%2==0)
    	   {
    		   System.out.print(i+",");
    	   }
    	   i++;
       }
    	   
	}

}
