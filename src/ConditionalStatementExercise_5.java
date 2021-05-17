import java.util.Scanner;

public class ConditionalStatementExercise_5 {

	public static void main(String[] args) {
		
		//Write a Java program that keeps a number from the user 
		//and generates an integer between 1 and 7 and displays the name of the weekday.

		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number between 1 to 7 = ");
		int num=s.nextInt();
		ConditionalStatementExercise_5 cse=new ConditionalStatementExercise_5();
	    System.out.println(cse.getDayName(num));
	}
	
	public String getDayName(int n)
	{
		String dayname="";
		switch(n)
		{
			case 1:
				dayname="Monday";
				break;
			case 2:
				dayname="Tuesday";
				break;
			case 3:
				dayname="Wednesday";
				break;
			case 4:
				dayname="Thursday";
				break;
			case 5:
				dayname="Friday";
				break;
			case 6:
				dayname="Saturday";
				break;
			case 7:
				dayname="Sunday";
		}
		
		return dayname;
		
	}

}
