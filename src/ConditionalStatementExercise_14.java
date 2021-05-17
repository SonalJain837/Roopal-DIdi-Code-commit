import java.util.Scanner;

public class ConditionalStatementExercise_14 {

	public static void main(String[] args) {
		// Write a program in Java to display the multiplication table of a given integer. 

		Scanner s =new Scanner(System.in);
		System.out.println("input the number (table to be calculated)");
		int num=s.nextInt();
		int t;
		for(int i=1;i<=num;i++)
		{
			t=num*i;
			System.out.println(num + " X " +i +" = "+ t);
		}
	}

}
