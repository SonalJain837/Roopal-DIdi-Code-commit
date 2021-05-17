package ArrayExercises;

import java.util.Arrays;

public class JavaArrayExercise_4 {

	public static void main(String[] args) {
		// Write a Java program to calculate the average value of array elements.
		
		int a[]= {5,2,7,1,9};
		System.out.println(Arrays.toString(a));
		int sum=0;
		float average;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		average=sum/a.length;
		//System.out.println(sum +" "+ a.length + " "+ average);
		System.out.println("Average value of array elements = "+ average);
	}

}
