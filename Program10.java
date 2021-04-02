// Write a java program to check whether a character is uppercase or lowercase alphabet.

package LogicalPrograms;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Ascii values of char's");
		int i=s.nextInt();
		char ch=(char)i;
		if(ch>='a' && ch<='z')
		{
			System.out.println("Lower case letters");
		}
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Upper  case letters");
		}

	}

}
