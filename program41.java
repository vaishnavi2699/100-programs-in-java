// Write a java program to count total number of even and odd elements in an array.
package LogicalPrograms;

import java.util.Scanner;

public class program41 
{

	public static void main(String[] args) 
	{
		int i=0,num=0,ecount=0,ocount=0;
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		System.out.println("Enter " +num+ " values");
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<num;i++)
		{
			if(arr[i]%2==0)
			{
			 ecount++;	
			}
			else
			{
				ocount++;
			}
		}
		System.out.println("Total number of even elements is: "+ecount);
        System.out.println("Total number of odd elements is: "+ocount);
	}

}
