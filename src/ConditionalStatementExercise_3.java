import java.util.Scanner;

public class ConditionalStatementExercise_3 {

	public static void main(String[] args) {
		
		//Take three numbers from the user and print the greatest number. 
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter 1st number = ");
		int a=s.nextInt();
		System.out.println("Please enter 2nd number = ");
		int b=s.nextInt();
		System.out.println("Please enter 3rd number = ");
		int c=s.nextInt();
		
		if((a>b)&&(a>c))
		{
			System.out.println(" greatest number is = "+a);
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("greatest number is = "+b);
		}
		else
		{
			System.out.println("greatest number is = "+c);
		}
	}
}
