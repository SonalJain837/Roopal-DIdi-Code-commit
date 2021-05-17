import java.util.Scanner;

public class ConditionalStatementExercise_31 {

	public static void main(String[] args) {
		// Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order, 
		//"decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.
		
		Scanner s=new Scanner(System.in);
		System.out.print("Input first number = ");
		int n1=s.nextInt();
		System.out.print("Input second number = ");
		int n2=s.nextInt();
		System.out.print("Input third number = ");
		int n3=s.nextInt();

		if(n1<n2 && n2<n3)
		{
			System.out.println("numbers are in increasing order");
		}
		else if(n1>n2 && n2>n3)
		{
			System.out.println("numbers are in decreasing order");
		}
		else
		{
			System.out.println("Neither increasing or decreasing order");
		}
		
	}

}
