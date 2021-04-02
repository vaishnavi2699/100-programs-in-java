// Write a java program to find frequency of each digit in a given integer.
package LogicalPrograms;                                           //123321

import java.util.Scanner;

public class program29 
{

	public static void main(String[] args)
	{
		int i=0,num=0,rem=0,count=0,freqcount=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your number to find frequency of a digit: ");
		num=s.nextInt();
		int temp=num;
		 while(num!=0)
		    {
		    	rem=num%10;
		    	num=num/10;
		    	count++;
		    }
		int arr[]=new int[count];
		num=temp;
	    while(num!=0)
	    {
	    	rem=num%10;
	    	arr[i]=rem;
	    	num=num/10;
	    	i++;
	    }
	    for(int j=0;j<arr.length;j++)
	    {
	    	for(int k=i+1;k<arr.length;k++)
	    	{
	    		if(arr[j]==arr[k])
	    		{
	    			freqcount++;
	    		}
	    	}
	    	System.out.println("Frequency of "+arr[j]+" : "+freqcount);
	    	freqcount=0;
	    }

	}

}
