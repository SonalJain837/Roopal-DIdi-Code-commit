package ArrayExercises;

import java.util.Arrays;

public class JavaArrayExercise_2 {

	public static void main(String[] args) {
		// Write a Java program to sum values of an array.
		
		int a[]= {2,7,1,0,23};
		System.out.println("Original array = "+Arrays.toString(a));
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			temp=temp+a[i];
		}
		System.out.println("Sum values of an array = "+ temp);

	}

}
