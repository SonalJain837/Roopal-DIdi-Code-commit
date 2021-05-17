package ArrayExercises;

import java.util.Scanner;

public class JavaArrayExercise_19 {

	public static void main(String[] args) {
		// Write a Java program to add two matrices of the same size.
		
		int n,m;
		Scanner s=new Scanner(System.in);
		System.out.print(" Enter row value = ");
		int row=s.nextInt();
		System.out.print(" Enter column value = ");
		int col=s.nextInt();
		
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int sum[][]=new int[row][col];
		
		System.out.println("Enter values for first array :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Enter values for second array :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Addition of two array :");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
				System.out.println(sum[i][j]);
			}
		}
	}

}
