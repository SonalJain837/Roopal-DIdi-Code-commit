import java.util.Scanner;

public class ConditionalStatementExercise_19 {

	public static void main(String[] args) {
		// Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.

		Scanner s=new Scanner(System.in);
		System.out.println("input number of rows : ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int sp=n;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
