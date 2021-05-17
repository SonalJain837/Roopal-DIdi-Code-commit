import java.util.Scanner;

public class ConditionalStatementExercise_7 {

	public static void main(String[] args) {

		//Write a Java program to find the number of days in a month.
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a month number = ");
		int m=s.nextInt();
		System.out.println("Input a year = ");
		int y=s.nextInt();
		
		//jan=31, feb=28/29, march=31 , aprl=30, may=31, june=30, july=31
		

		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)
		{
			System.out.println("number of days in month "+m+" are = 31");
		}
		else if(m==4 || m==6 || m==9 || m==11)
		{
			System.out.println("number of days in month "+m+" are = 30");
		}
		else if(y%4!=0 && m==2)
		{
			System.out.println("number of days in month "+m+" are = 28");
		}
		else if(y%4==0 && m==2)
		{
			System.out.println("number of days in month "+m+" are = 29");
		}
		else
		{
			System.out.println("entered month number is not there in calendar");
		}
		
	}

}
