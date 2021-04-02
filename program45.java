// Write a java program to print all duplicate elements in the array.
package LogicalPrograms;
import java.util.Scanner;
public class program45 
{

	public static void main(String[] args) 
	{
		int i=0,j=0,num=0,count=0;
		int arr[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		num=s.nextInt();
		System.out.println("Enter " +num+ " values");
        for(i=0;i<num;i++)
        {
        	arr[i]=s.nextInt();
        }
        System.out.println("Duplicate elements are: ");
        for(i=0;i<num;i++)
        {
        	for(j=i+1;j<num;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			System.out.println(arr[i]);
        			count++;
        			break;
        		}
        	}
        }
        if(count!=0)
        {
        	System.out.println("Total number of duplicate elements are: "+count);
        }
        else
        {
        	System.out.println("no matching elements");
        }
       
	}
	

}
