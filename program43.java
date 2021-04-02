//Write a java program to find search element and occurance of element in an array.
package LogicalPrograms;

import java.util.Scanner;

public class program43 
{

	public static void main(String[] args) 
	{
		int i=0,search=0,num=0,count=0;
	    int arr[]=new int[10];
	    Scanner s=new Scanner(System.in);
	    System.out.println("How many values do you want to enter: ");
	    num=s.nextInt();
	    System.out.println("enter " +num+ " values");
	    for(i=0;i<num;i++)
	    {
	    	arr[i]=s.nextInt();
	    }
	    System.out.println("Enter search element");
	    search=s.nextInt();
	    for(i=0;i<num;i++)
	    {
	    	if(search==arr[i])
	    	{
	    		count++;
	    	}
	    }
	    if(count!=0)
		{
			System.out.println("no.of occurances: "+count);
		}
		else
		{
			System.out.println("search element is not there");
		}
	}
	

}
