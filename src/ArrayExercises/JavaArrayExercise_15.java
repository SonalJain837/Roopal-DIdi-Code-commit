package ArrayExercises;

public class JavaArrayExercise_15 {

	public static void main(String[] args) {
		// Write a Java program to find the common elements between two arrays of integers.
		
		int a1[]= {10,2,13,4,55,6,89};
		int a2[]= {1,12,13,4,5,6,7,89,9};
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					System.out.println("Common element = "+ a1[i]);
				}
			}
		}

	}

}
