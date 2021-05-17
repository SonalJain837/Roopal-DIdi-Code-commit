package ArrayExercises;

public class JavaArrayExercise_13 {

	public static void main(String[] args) {
		// Write a Java program to find the duplicate values of an array of string values. 
		
		String s[]= {"Adam", "linc", "Nina", "linc", "Damon", "Stefan", "damon"};
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equalsIgnoreCase(s[j]) && (i!=j))    // the 2nd condition is not necessary here becz value of i and j can't be equal.
				{
					System.out.println("Duplicate String = "+ s[i]);
				}
			}
		}

	}

}
