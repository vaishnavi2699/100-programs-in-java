// Write a java program to input basic salary of an employee and calculate its Gross     salary according to following:
 /*Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/
package LogicalPrograms;

import java.util.Scanner;

public class Program12 
{

	public static void main(String[] args) 
	{
		int basicsalary,gs,hra,da;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter basicsalary to print grosssalary: ");
		basicsalary=s.nextInt();
		if(basicsalary<=10000)
		{
			hra=(basicsalary/100)*20;
			da=(basicsalary/100)*25;
            gs=hra+da+basicsalary;
            System.out.println("hra is: "+hra);
            System.out.println("da is: "+da);
            System.out.println("gs is: "+gs);
			
		}
		else if(basicsalary<=20000)
		{
			hra=(basicsalary/100)*25;
			da=(basicsalary/100)*90;
            gs=hra+da+basicsalary;
            System.out.println("hra is: "+hra);
            System.out.println("da is: "+da);
            System.out.println("gs is: "+gs);
			
		}
		else if(basicsalary>20000)
		{
			hra=(basicsalary/100)*30;
			da=(basicsalary/100)*95;
            gs=hra+da+basicsalary;
            System.out.println("hra is: "+hra);
            System.out.println("da is: "+da);
            System.out.println("gs is: "+gs);
			
		}
		else
		{
			System.out.println("Invalid Basicsalary");
		}

	}

}
