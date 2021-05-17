import java.util.Scanner;

public class ConditionalStatementExercise_17 {

	public static void main(String[] args) {
		//  Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.
		//The pattern is as follows : 
		
		Scanner s=new Scanner(System.in);
		System.out.println("input number of rows : ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
