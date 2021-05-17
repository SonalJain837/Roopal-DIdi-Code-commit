package ArrayExercises;

import java.util.Arrays;

public class JavaArrayExercise_17 {

	public static void main(String[] args) {
		// Write a Java program to find the second largest element in an array.
		
		int a[]= {5,33,7,12,11,9};
		
		System.out.println("Original Array = "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted Array = "+ Arrays.toString(a));
		
		System.out.println("Second largest element = "+ a[a.length-2]);
		
	}

}
