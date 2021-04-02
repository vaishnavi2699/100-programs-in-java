// Write a jav program to accept ASCII value and check whether it is vowel or consonant.
package LogicalPrograms;
import java.util.Scanner;
public class Program8 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Ascii values of char's:  ");
		int i=s.nextInt();
		char ch=(char)i;
		if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("vowels");
		}
		else 
		{
			System.out.println("consonents");
		}

	}

}
