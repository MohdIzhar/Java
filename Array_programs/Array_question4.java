/*
 * Given a fixed length array array of integers, 
 * duplicate each occurrence of zero, 
 * shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]

 */
package java_programs;

public class Array_question4 
{

	public static void main(String[] args) 
	{
		int[] arr = {1,0,2,3,0,4,5,0};
		int index = arr.length;
		int j=0;
		int[] result = new int[index];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] != 0)
			{
				result[j++] = arr[i];
			}
			else
			{
				index = arr.length + 1;
				result[j++] = arr[i];
				result[j++] = 0;
			}
		}
		for(j = 0; j < result.length; j++) 
		{
			System.out.println(result[j] + " ");
		}
	}

}
