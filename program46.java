//Write a java program to find length of a string and compare and concatenate two     strings
package LogicalPrograms;

import java.util.Scanner;

public class program46
{

	public static void main(String[] args) 
	{
		String str;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String: ");
		str=s.nextLine();
		System.out.println("Number of characters: "+str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(3));
        System.out.println(str.substring(1));
        System.out.println(str.substring(1,5));
	}

}
