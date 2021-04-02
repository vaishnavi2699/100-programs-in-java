// Write a java program to input electricity unit charges and calculate total     electricity bill according to the given condition:
   // For first 50 units Rs. 0.50/unit
    //For next 100 units Rs. 0.75/unit
    //For next 100 units Rs. 1.20/unit
     //For unit above 250 Rs. 1.50/unit
     //An additional surcharge of 20% is added to the bill
package LogicalPrograms;

import java.util.Scanner;

public class Program13 
{

	public static void main(String[] args) 
	{
		int units;
		int surcharge;
		double bill=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter units to calculate electricity bill: ");
		units=s.nextInt();
		if(units<=50)
		{
			bill=units*0.50;
		}
		else if(units<=150)
		{
			bill=(units*50)+(units-50)*0.75;
		}
		else if(units<=250)
		{
			bill=(units*50)+(units-50)*0.75+(units-100)*1.20;
		}
		else if(units>250)
		{
			bill=(units*50)+(units-50)*0.75+(units-100)*1.20+(units-150)*1.50;
		}
		surcharge=(int) ((bill/100)*20);
		System.out.println("Float bill is: "+bill);
	}

}
