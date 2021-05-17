package ArrayExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayExercise_16 {

	public static void main(String[] args) {
		// Write a Java program to remove duplicate elements from an array.
		
		int a[]= {0, 3, -2, 4, 3, 2};
		
		System.out.println("Original arrya = "+Arrays.toString(a));
		
		List<Integer> list=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			list.add(a[i]);
			
		}	
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					list.remove(j);
				}
			}
		}
		
		System.out.println("Array after removing duplicate values = "+list);
	}

}
