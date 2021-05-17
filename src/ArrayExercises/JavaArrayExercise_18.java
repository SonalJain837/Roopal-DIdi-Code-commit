package ArrayExercises;

import java.util.Arrays;

public class JavaArrayExercise_18 {

	public static void main(String[] args) {
		// Write a Java program to find the second smallest element in an array.
		
		int a[]= {5,23,7,12,89,34,43,22,77};
		
		System.out.println("Original array = "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted array = "+ Arrays.toString(a));
		
		System.out.println("second smallest element = "+ a[1]);

	}

}
