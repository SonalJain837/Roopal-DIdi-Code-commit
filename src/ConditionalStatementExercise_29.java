import java.util.Scanner;

public class ConditionalStatementExercise_29 {

	public static void main(String[] args) {
		// Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
		
		Scanner s=new Scanner(System.in);
		System.out.println("Input a integer less then ten billion = ");
		long n=s.nextLong();
		long count=0;
		if(n<10000000000L)
		{
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println("Number of digits in the number = "+count);
		}
		else
		{
			System.out.println("Number is greater then 10 billion");
		}
	}

}
