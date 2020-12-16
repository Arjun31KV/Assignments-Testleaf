package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr); //to sort array in ascending order
		
		for(int i=0; i<arr.length; i++)
		{
			if(i+1 != arr[i]) //i+1 because if i=0 then in 0th place the array value is 1, so increase i+1.
			{
				System.out.println("missing Element is: " +(i+1));
				break;
			}
		}
	}

}
