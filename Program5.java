// Write a java program to check whether a year is leap year or not.
package LogicalPrograms;
import java.util.Scanner;
public class Program5
{

	public static void main(String[] args)
	{
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("enter year to check leap year or not: ");
		year=s.nextInt();
		if(year%400==0)
		{
			System.out.println("leap year");
		}
		else if(year%100==0)
		{
			System.out.println("leap year");
		}
		else if(year%4==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}

	}

}
