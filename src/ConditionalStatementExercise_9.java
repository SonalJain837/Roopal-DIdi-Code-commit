import java.util.Scanner;

public class ConditionalStatementExercise_9 {

	public static void main(String[] args) {
		// Write a Java program that takes a year from user and print whether that year is a leap year or not.

		Scanner s=new Scanner(System.in);
		System.out.println("Enter year : ");
		int year=s.nextInt();
		
		/*if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("leap year");
				}
				else
				{
					System.out.println("not a leap year");
				}
			}
			else
			{
				System.out.println("leap year");
			}
		}
		else
		{
			System.out.println("not a leap year");
		}*/
		
		 if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	}
		
		

}
