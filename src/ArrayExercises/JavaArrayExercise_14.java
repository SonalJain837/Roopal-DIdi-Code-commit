package ArrayExercises;

import java.util.HashSet;

public class JavaArrayExercise_14 {

	public static void main(String[] args) {
		// Write a Java program to find the common elements between two arrays (string values).
		
		String s1[]= {"Adam", "Linc","Stefan","Nina"};
		String s2[]= {"Nina", "Damon", "Adam", "Mac","Bonnie"};
		
		HashSet<String> set= new HashSet<String>();
		
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i].equalsIgnoreCase(s2[j]))
				{
					//System.out.println("Common element = "+ s1[i]);    instead of this u can add all common elements in a set ,, by using below code
					set.add(s1[i]);
				}
			}
		}
		
		System.out.println("Common Elements are = "+ set);

	}

}
