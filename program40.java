// Write a java program to find maximum and minimum element in an array.
package LogicalPrograms;

import java.util.Scanner;

public class program40 
{
	public void min()
	{
		int min=0,i=0,num=0;
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		System.out.println("Enter " +num+  " values");
		min=s.nextInt();
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<num;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Minimum value is: "+min);
	}
	public void max()
	{
		int i=0,max=0,num=0;
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		System.out.println("Enter "  +num+  " values");
		for(i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		for(i=0;i<num;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum value is: "+max);
	}

	public static void main(String[] args) 
	{
		program40 d=new program40();
		int options;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter options to excute the program 1.min 2.max");
		options=s.nextInt();
		System.out.println("Executing your program: "+options);
		switch(options)
		{
		case 1:
		{
			d.min();
			break;
		}
		case 2:
		{
			d.max();
			break;
		}
		default:
		{
			System.out.println("Invalid option");
		}
		}
		

	}

}
