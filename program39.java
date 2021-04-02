// Write a java program to print all negative elements in an array
package LogicalPrograms;

import java.util.Scanner;

public class program39 
{

	public static void main(String[] args) 
	{
		int num=0,i=0;
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Negative elements are: ");
		for(i=0;i<num;i++)
		{
			if(arr[i]<0)
			{
				System.out.println(arr[i]);
			}
			
		}
			
    }

}
