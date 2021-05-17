package ArrayExercises;

public class JavaArrayExercise_12 {

	public static void main(String[] args) {
		// Write a Java program to find the duplicate values of an array of integer values.

		int a[]= {1, 2, 5, 5, 6, 6, 7, 2};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate element =" + a[i]);
				}
			}
		}
	}

}
