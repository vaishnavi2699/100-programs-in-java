// Write a Java program to find reverse of a string.

package LogicalPrograms;

import java.util.Scanner;

public class program49 
{

	public static void main(String[] args) 
	{
		String str;
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		str=s.nextLine();
		for(i=str.length()-1;i>0;i--)
		{
			System.out.print(str.charAt(i)+" ");
		}


	}

}
