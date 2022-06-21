package assignment1;

import java.util.Scanner;

public class AdvanceCalculator {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n1,n2;
		int ans=1;
		double c=0;
		char choice;
		
		do
		{
			System.out.println( "Enter any two numbers:");
			n1=s.nextInt();
			n2=s.nextInt();
			System.out.println("a. Addition\nb. Subtraction\nc. Multiplication\nd. Division\ne. Percentage \nf. Power \ng. Exit");
			System.out.println("Enter Your Choice: ");
			choice=s.next().charAt(0);
			
			switch(choice)
			{
			case 'a':
				c=n1+n2;
				System.out.println("Addition of two numbers is: "+c);
				break;
			case 'b':
				if(n1>n2)
					c=n1+n2;
				else
					c=n2-n1;
				System.out.println("Subtraction of two numbers is: "+c);
				break;
			case 'c':
				c=n1*n2;
				System.out.println("Multiplication of two numbers is: "+c);
				break;
			case 'd':
				if(n2==0)
					System.out.println("Denominator should not be zero");
				else
				{
					c=n1/n2;
					System.out.println("Division of two numbers is: "+c);
				}
				break;
			
			case 'e':
				c = (n1+n2)/2;
				System.out.println("Percentage : "+c);
				break;
				
			case 'f':
				c = Math.pow(n1, n2);
				System.out.println("Power  : "+c);
			case 'g':
				System.exit(0);
				break;
			default:
				System.out.println("Wrong Choice");
			}
			System.out.println("Do you want to continue(1/0)?");
			ans=s.nextInt();
		}while(ans!=0);
	}
}
