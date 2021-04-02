//  Write a java program to print exact word of a string.
package LogicalPrograms;

import java.util.Scanner;

public class program48 
{

	public static void main(String[] args) 
	{
		String str;
		int i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		str=s.nextLine();
		for(i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i)+" ");
		}

	}

}
