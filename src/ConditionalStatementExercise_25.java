import java.util.Scanner;

public class ConditionalStatementExercise_25 {

	public static void main(String[] args) {
		// Write a Java program to display the number rhombus structure.
		/*
	  1                                                  
     212                                                 
    32123                                                
   4321234                                               
  543212345                                              
 65432123456                                             
7654321234567                                            
 65432123456                                             
  543212345                                              
   4321234                                               
    32123                                                
     212                                                 
      1   
		 */

		Scanner s=new Scanner(System.in);
		System.out.println("Input a number = ");
		int n=s.nextInt();
		int start=0 , count=1, no_of_spc=1;
		
		for(int i=1;i<=n*2;i++)
		{
			for(int sp=n-no_of_spc;sp>0;sp--)
			{
				System.out.print(" ");
			}
			
			if(i<n)
			{
				start=i;
				no_of_spc++;
			}
			else
			{
				start=n*2-i;
				no_of_spc--;
			}
			
			for(int j=0;j<count;j++)
			{
				System.out.print(start);
				if(j<count/2)
				{
					start--;
				}
				else
				{
					start++;
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
			}
		
			
		}
	}


