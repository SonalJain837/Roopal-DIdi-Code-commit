import java.util.Scanner;

public class ConditionalStatementExercise_16 {

	public static void main(String[] args) {
		// Write a program in Java to display the pattern like right angle triangle with a number.
       
		Scanner s=new Scanner(System.in);
		System.out.println("Input number of rows : ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}

}
