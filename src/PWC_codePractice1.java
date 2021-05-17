import java.util.Scanner;

public class PWC_codePractice1 {

	public static void main(String[] args) {
		// Write a java program to Reverse a number?
		
		Scanner s=new Scanner(System.in);
		System.out.println("Input any number = ");
		int n=s.nextInt();
		int original_n=n;
		int r=0;
		while(n>0)
		{
			r=r*10+n%10;
			n=n/10;
		}
		System.out.println("Reverse number is = "+r);
		
		/////////        To check palindrome number            //////////////////////////
		
		if(original_n==r)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}

	}

}
