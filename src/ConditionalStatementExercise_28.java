import java.util.Scanner;

public class ConditionalStatementExercise_28 {

	public static void main(String[] args) {
		// Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". 
		//Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000. 
		
		Scanner s=new Scanner(System.in);
		System.out.println("Input a number = ");
		Float n=s.nextFloat();
		
		if(n>0)
		{
		if(n>1000000)
		{
			System.out.println("Number is large positive");
		}
		else if(n<1 && n>0)
		{
			System.out.println("Number is small positive");
		}
		else
		{
			System.out.println("Number is positive");
		}
		}
		
		else if(n<0)
		{
			if(Math.abs(n)>1000000)
			{
				System.out.println("Number is large Negative");
			}
			else if(Math.abs(n)<1)
			{
				System.out.println("Number is small Negative");
			}
			else
			{
				System.out.println("Number is negative");
			}
		}
		else
		{
			System.out.println("Number is zero");
		}

	}

}
