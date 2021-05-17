package ArrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArrayExercise_7 {

	public static void main(String[] args) {
		// Write a Java program to remove a specific element from an array.
		
		int a[]= {5,8,12,4,9};
		
		System.out.println(Arrays.toString(a));
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number which you want to delete from array = ");
		int num=s.nextInt();
		int flag=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				flag=1;
				for(int j=i+1;j<a.length;j++)
				{
					a[j-1]=a[j];
				}
				break;
			}
		}
		if(flag==1)
		{
		for(int k=0;k<a.length-1;k++)
		{
			System.out.println(a[k]+" ");
		}
	    }
		
		else
		{
			System.out.println("number is not present in an array");
		}
		
		
		
		/*
		 int n, x, flag = 1, loc = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        System.out.print("Enter the element you want to delete:");
	        x = s.nextInt();
	        for (int i = 0; i < n; i++) 
	        {
	            if(a[i] == x)
	            {
	                flag =1;
	                loc = i;
	                break;
	            }
	            else
	            {
	                flag = 0;
	            }
	        }
	        if(flag == 1)
	        {
	            for(int i = loc+1; i < n; i++)
	            {
	                a[i-1] = a[i];
	            }
	            System.out.print("After Deleting:");
	            for (int i = 0; i < n-2; i++) 
	            {
	                System.out.print(a[i]+",");
	            }
	            System.out.print(a[n-2]);
	        }
	        else
	        {
	            System.out.println("Element not found");
	        }*/
	}

}
