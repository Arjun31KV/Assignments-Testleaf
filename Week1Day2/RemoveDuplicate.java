package week1.day2;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,6,4,2,9,2,8,10};
		
		//System.out.println(arr.length); //(to print array length/size)
		int count;
		
		Arrays.sort(arr);
		
		System.out.println("THE Duplicates are removed & executed: ");
		
		for (int i=0;i<=arr.length-1;i++)
		{
			count = 0; 
			
			for (int j=i+1; j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					count = count + 1;
				}
			
			}
			if(count == 0)
			{
				System.out.println(arr[i]);
			}
		}
		
	/*	for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=i+1; j<=arr.length-1;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
				}
				
			
			}
			
			
		} */
		
	}

}
