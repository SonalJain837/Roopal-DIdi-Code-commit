package ArrayExercises;

public class JavaArrayExercise_10 {

	public static void main(String[] args) {
		// Write a Java program to find the maximum and minimum value of an array.
		
		int a[]= {6,220,8,10,1111,99,7,110};
		int min=a[0], max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("minimum array value is = "+ min);
		System.out.println("maximum array value is = "+ max);

	}

}
