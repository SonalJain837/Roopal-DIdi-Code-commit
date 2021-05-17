import java.util.Scanner;

public class PWC_codePractice3 {

	public static void main(String[] args) {
		// Write a program Search a letter in string?
		
		String str="Roopal Jain is a very beautiful girl";
		System.out.println("original String = "+ str);
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a character to be searched = ");
		char ch=s.next().charAt(0);
		
		
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println("Charater is not present in the string ");
		}
		else
		{
		System.out.println("Occurance of character "+ch+ " are = "+count );
		}

	}

}
