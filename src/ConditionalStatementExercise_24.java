import java.util.Scanner;

public class ConditionalStatementExercise_24 {

	public static void main(String[] args) {
		// Write a java program to generate a following @'s triangle. 
		/*
		       @                                                  
     		  @@                                                  
    		 @@@                                                  
   			@@@@                                                  
  		   @@@@@                                                  
 		  @@@@@@
		 */

		Scanner s=new Scanner(System.in);
		System.out.println("Input the number = ");
		int n=s.nextInt();
		
		for(int i=n;i>0;i--)
		{
			for(int sp=0;sp<i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("@");
			}
			System.out.println("");
		}
	}

}
