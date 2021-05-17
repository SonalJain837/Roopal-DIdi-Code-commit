import java.util.Scanner;

public class ConditionalStatementExercise_21 {

	public static void main(String[] args) {
		// Write a program in Java to display the pattern like a diamond.
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of terms = ");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int sp=n;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int sp=i;sp<=n;sp++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
