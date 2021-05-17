import java.util.Scanner;

public class ConditionalStatementExercise_12 {

	public static void main(String[] args) {
		// Write a program in Java to input 5 numbers from keyboard and find their sum and average.
		
		System.out.println("Enter 5 numbers : ");
		int sum=0;
		float avg;
		for(int i=0;i<5;i++)
		{
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			sum=sum+n;
		}
		avg=sum/5;
		System.out.println("Sum = "+sum+" & Average = "+avg);
	}

}
