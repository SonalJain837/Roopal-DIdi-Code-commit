package ArrayExercises;

import java.util.Arrays;

public class JavaArrayExercise_11 {

	public static void main(String[] args) {
		// Write a Java program to reverse an array of integer values.
		
		int a[]= {5,1,435,56,8,10,55,12,110};
		System.out.println("Original array = "+Arrays.toString(a));
		int temp=0;
		int l=a.length;
		
		if(l%2==0)
		{
			for(int i=0;i<l/2;i++)
			{
				temp=a[i];
				a[i]=a[l-(i+1)];
				a[l-(i+1)]=temp;
			}
			System.out.println("Reverse array ="+Arrays.toString(a));
		}
		
		else
		{
			for(int i=0;i<l/2;i++)
			{
				temp=a[i];
				a[i]=a[l-(i+1)];
				a[l-(i+1)]=temp;
			}
			System.out.println("Reverse array ="+Arrays.toString(a));
		}

	}

}
