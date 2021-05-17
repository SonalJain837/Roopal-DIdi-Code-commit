import java.util.Scanner;

public class ConditionalStatementExercise_18 {

	public static void main(String[] args) {
		// Write a program in Java to make such a pattern like right angle triangle with number increased by 1.The pattern like 

		Scanner s=new Scanner(System.in);
		System.out.println("input number of rows : ");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				sum=sum+1;
				System.out.print(sum);
			}
			System.out.println();
		}
		
	}

}
