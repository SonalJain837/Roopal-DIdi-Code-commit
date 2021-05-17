package ArrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArrayExercise_5 {

	public static void main(String[] args) {
		// Write a Java program to test if an array contains a specific value.
		
		int a[]= {4,7,2,1,82,12,0};
		System.out.println("Original Array = "+ Arrays.toString(a));
		Scanner s=new Scanner(System.in);
		System.out.print("please enter a value to find in an array = ");
		int value=s.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==value)
			{
				System.out.println("We have found the value in "+(i+1) +"th position");
				break;
			}
			else if(i==a.length-1)
			{
				System.out.println("Value is not present in an array");
			}
		}
		
		

	}

}
