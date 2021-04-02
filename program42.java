//Write a java program to count total number of negative elements in an array.
package LogicalPrograms;

import java.util.Scanner;

public class program42 {

	public static void main(String[] args) 
	{
       int i=0,num=0,ncount=0;
       int arr[]=new int[10];
       Scanner s=new Scanner(System.in);
       System.out.println("How many values do you want to enter: ");
       num=s.nextInt();
       System.out.println("Enter " +num+ " values");
       for(i=0;i<num;i++)
       {
    	arr[i]=s.nextInt();
       }
       System.out.println("Negative values are: ");
       for(i=0;i<num;i++)
       {
    	   if(arr[i]<0)
    	   {
    		  
    		   ncount++;
    		   System.out.println(arr[i]);
    	   }
       }
       System.out.println("Number of negative elements is: "+ncount);
	}

}
