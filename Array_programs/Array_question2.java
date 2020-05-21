/*
 * Given an array n of integers, return how many of them contain an even number of digits.
 
Example 1:

Input: n = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
 */

package java_programs;

public class Array_question2 
{

	public static void main(String[] args) 
	{
		int count = 0, result = 0;
		int[] arr = {437,315,322,431,6861,264,442};
		for(int i = 0; i < arr.length; i++)
		{
			while(arr[i] != 0)
			{
				arr[i] = (int)(arr[i] / 10);
				count +=1;
			}
			if(count % 2 == 0)
			{
				result +=1;
			}
			count = 0;
		}
		System.out.println("Result: "+ result);

	}

}
