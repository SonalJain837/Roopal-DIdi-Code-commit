import java.util.Scanner;

public class ConditionalStatementExercise_30 {

	public static void main(String[] args) {
		// Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal, 
		//"All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st number = ");
		int n1=s.nextInt();
		System.out.println("Enter 2nd number = ");
		int n2=s.nextInt();
		System.out.println("Enter 3rd number = ");
		int n3=s.nextInt();
		
		if(n1==n2 && n2==n3)
		{
			System.out.println("All three numbers are equal");
		}
		else if(n1!=n2 && n2!=n3 && n3!=n1)
		{
			System.out.println("All three numbers are different");
		}
		else
		{
			System.out.println("Neither all are equal or different");
		}
			
	}

}
