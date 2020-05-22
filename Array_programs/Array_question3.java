/*
 * Given an array of integers A sorted in non-decreasing order, 
 * return an array of the squares of each number, 
 * also in sorted non-decreasing order.
 
Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
 */

package java_programs;

public class Array_question3 
{

	public static void main(String[] args) 
	{
		int[] arr = {-4,-1,0,3,10};
		int[] sqr_arr = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			sqr_arr[i] = arr[i] * arr[i];
		}
		int temp;
		for(int i = 0; i < sqr_arr.length; i++)
		{
			for(int j = i+1; j < sqr_arr.length; j++)
			{
				if(sqr_arr[i] >= sqr_arr[j])
				{
					temp = sqr_arr[i];
					sqr_arr[i] = sqr_arr[j];
					sqr_arr[j] = temp;
				}
			}
		}
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(sqr_arr[i]+" ");
		}
		
	}

}
