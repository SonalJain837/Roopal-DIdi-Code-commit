import java.util.Arrays;

public class PWC_codePractice2 {

	public static void main(String[] args) {
		// write a program to Sort an array?
		
		int a[]= {4,1,8,2,0,55,11};
		int temp=0;
		
		System.out.println("Original Array = "+ Arrays.toString(a));
		
		/*for(int i=0;i<a.length;i++)
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
		
		System.out.println("Sorted Array = "+ Arrays.toString(a));
		*/
		
		// Shortcut method
		
		Arrays.sort(a);
		System.out.println("Sorted Array = "+ Arrays.toString(a));

	}

}
