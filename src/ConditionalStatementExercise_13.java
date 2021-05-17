import java.util.Scanner;

public class ConditionalStatementExercise_13 {

	public static void main(String[] args) {
		//  Write a program in Java to display the cube of the number upto given an integer. 
		int c;
		Scanner s=new Scanner(System.in);
		System.out.println("Input number of terms : ");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			c=i*i*i;
			System.out.println(" Number is : "+i+" The cube of "+i+" is : "+c);
		}
	}

}
