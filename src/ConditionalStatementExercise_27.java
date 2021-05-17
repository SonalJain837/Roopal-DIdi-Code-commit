import java.util.Scanner;

public class ConditionalStatementExercise_27 {

	public static void main(String[] args) {
		// Write a Java program that reads an integer and check whether it is negative, zero, or positive. 

		Scanner s=new Scanner(System.in);
		System.out.println("Input a number = ");
		int n=s.nextInt();
		
		if(n==0)
		{
			System.out.println("Number is zero");
		}
		else if(n<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is positive");
		}
	}

}
