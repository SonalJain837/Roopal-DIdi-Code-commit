package ArrayExercises;

import java.util.Arrays;

public class JavaArrayExercise_8 {

	public static void main(String[] args) {
		//Write a Java program to copy an array by iterating the array. 
		
		int a[]= {4,7,1,88,90};
		System.out.println("a array values = "+ Arrays.toString(a));
		int b[] = new int[5];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}

		System.out.println("b array values = "+Arrays.toString(b));
	}

}
