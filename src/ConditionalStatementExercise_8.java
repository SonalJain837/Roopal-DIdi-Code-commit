import java.util.Scanner;

public class ConditionalStatementExercise_8 {

	public static void main(String[] args) {
		// Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, 
		//depending on the user input. 
		//If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message. 

		Scanner s=new Scanner(System.in);
		System.out.println("Please enter any letter = ");
		String l=s.next();
		System.out.println("Entered letter is = "+l);
		if(l.length()>1)
		{
			System.out.println("you should enter only one letter");
		}
		else
		{
			if(l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u") || l.equals("A") || l.equals("E") || l.equals("I") || l.equals("O") || l.equals("U"))
			{
				System.out.println("entered letter is vowel");
			}
			else
			{
				System.out.println("entered letter is consonant");
			}
		}
		
	}

}
