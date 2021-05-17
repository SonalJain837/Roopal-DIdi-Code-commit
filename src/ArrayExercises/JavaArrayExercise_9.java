package ArrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArrayExercise_9 {

	public static void main(String[] args) {
		// Write a Java program to insert an element (specific position) into an array.
		
		int a[]={6,3,9,1,0};
		System.out.println("The original a array ="+ Arrays.toString(a));
		
		int b[]=new int[6];
		
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a specific position in which you want to insert an element = ");
		int index=s.nextInt();
		System.out.print("enter element which you want to insert = ");
		int element=s.nextInt();
		
		int l=a.length;
		int temp=0, next=0;
		
		if(index<l)
		{
		for(int i=0;i<l;i++)
		{
			b[i]=a[i];
			if(i==index)
			{
				
				temp=a[i];
				b[i]=element;
				
				for(int j=i+1;j<b.length-1;j++)
				{
					next=a[j];
					b[j]=temp;
					temp=next;
				}
				b[l]=temp;
				break;
			}
		}
		
		System.out.println("b array "+ Arrays.toString(b));
		}
		else
		{
			System.out.println("entered index position does not exist");
		}
	}

}
