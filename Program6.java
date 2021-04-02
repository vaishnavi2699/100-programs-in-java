// Write a java program to accept any ASCII values from user and check whether it is alphabet, digit or special character.
package LogicalPrograms;
import java.util.Scanner;
public class Program6 
{

	public static void main(String[] args)
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Ascii values of char's:  ");
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
		else if(ch>=0 && ch<=9)
		{
			System.out.println("Digits");
		}
		else
		{
			System.out.println("special character");
		}
		
		

	}

}
