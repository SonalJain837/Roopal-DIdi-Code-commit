import java.util.Scanner;

public class ConditionalStatementExercise_1 {

	public static void main(String[] args) {

		// Write a Java program to get a number from the user and print whether it is positive or negative.
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number = ");
		int num=s.nextInt();
		//System.out.println("the entered number is = "+num);
		if(num<0)
		{
			System.out.println("Entered number is negative ");
		}
		else
		{
			System.out.println("Entered number id positive");
		}
	}

}
