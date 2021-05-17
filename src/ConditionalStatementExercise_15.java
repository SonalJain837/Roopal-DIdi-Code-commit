import java.util.Scanner;

public class ConditionalStatementExercise_15 {

	public static void main(String[] args) {
		// Write a program in Java to display the n terms of odd natural number and their sum. 

		Scanner s=new Scanner(System.in);
		System.out.println("Input number of terms is : ");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			
				System.out.println(2*i-1);
				sum=sum+(2*i-1);
		}
		System.out.println("Sum of all odd numbers are : "+sum);
	}

}


//its not done yet 