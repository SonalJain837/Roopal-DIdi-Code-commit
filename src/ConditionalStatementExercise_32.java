import java.util.Scanner;

public class ConditionalStatementExercise_32 {

	public static void main(String[] args) {
		//  Write a Java program that accepts two floating­point numbers and checks whether they are the same up to two decimal places.
		
		Scanner s=new Scanner(System.in);
		System.out.println("input first floation point number = ");
		double n1=s.nextDouble();
		System.out.println("input second floation point number = ");
		double n2=s.nextDouble();
		
		String n1_part1=String.valueOf(n1).split("\\.")[0];
		String n1_part2=String.valueOf(n1).split("\\.")[1].substring(0, 2);

		
		String[] n2_parts=String.valueOf(n2).split("\\.");
		String n2_part1=n2_parts[0];
		String n2_part2=n2_parts[1].substring(0,2);
		
		System.out.println(n1_part1);
		System.out.println(n1_part2);
		System.out.println(n2_part1);
		System.out.println(n2_part2);
		
		if(n1_part1.equals(n2_part1) && n1_part2.equals(n2_part2))
		{
			System.out.println("numbers are same upto two decimal places");
		}
		else
		{
			System.out.println("numbers are different");
		}
	}

}
