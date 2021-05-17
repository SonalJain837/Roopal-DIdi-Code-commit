import java.util.Scanner;

public class ConditionalStatementExercise_11 {

	public static void main(String[] args) {
		// Write a program in Java to display n terms of natural numbers and their sum.
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n = ");
		int n=s.nextInt();
		System.out.println("First n natural numbers are : ");
		int temp=0;
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
			temp=temp+i;
		}
		System.out.println("The sum of 'n' natural numbers are : "+temp);
	}

}
