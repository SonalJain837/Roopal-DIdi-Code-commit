import java.util.Scanner;

public class ConditionalStatementExercise_26 {

	public static void main(String[] args) {


		Scanner s=new Scanner(System.in);
		System.out.println(" Input a number = ");
		int n=s.nextInt();
		
		char Start='A';
		int count=1, no_of_spc=1;
		
		for(int i=0;i<=n*2;i++)
		{
			for(int sp=n-no_of_spc;sp>0;sp--)
			{
				System.out.print(" ");
			}
			
			if(i<n)
			{
				no_of_spc++;
			}
			else
			{
				no_of_spc--;
			}
			
			for(int j=0;j<count;j++)
			{
				System.out.print(Start);
				if(j<count/2)
				{
					Start++;
				}
				else
				{
					Start--;
				}
			}
			if(i<n)
			{
				count=count+2;
			}
			else
			{
				count=count-2;
			}
			System.out.println();
			Start='A';
		}
	}

}
