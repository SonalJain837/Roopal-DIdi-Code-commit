import java.util.Scanner;

public class ConditionalStatementExercise_20 {

	public static void main(String[] args) {
		// Write a program in Java to print the Floyd's Triangle.
		/* 1 
		   2 3 
		   4 5 6 
		   7 8 9 10 
		   11 12 13 14 15   */
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number of terms = ");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				sum++;
				System.out.print(sum);
			}
			System.out.println();
		}
	}

}
