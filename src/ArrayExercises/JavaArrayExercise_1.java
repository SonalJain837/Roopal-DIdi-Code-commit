package ArrayExercises;

import java.util.Arrays;

public class JavaArrayExercise_1 {

	public static void main(String[] args) {
		// Write a Java program to sort a numeric array and a string array.

		
		// Sorting an int Array
		int a[]= {5,11,3,9,14,2};
		System.out.println("Original int Array = "+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Original Sorted Array = "+ Arrays.toString(a));          // Instead of this one line to sort array , you can also sort array by doing the below code.
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Original sorted array = ");
		for(int k=0;k<a.length;k++)
		{
			System.out.print(" "+a[k]+"  ");
		}
		System.out.println("");
		
		
		// Sorting Array of String
		String s[]= {"Roopal", "Harsh" , "Sonal" , "Priyanka" , "Mukesh"};
		System.out.println("Original String Array = "+ Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("Original Sorted Array = "+ Arrays.toString(s));
	}

}
