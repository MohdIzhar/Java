/*
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
*/


package java_programs;

public class Array_questions 
{

	public static void main(String[] args) 
	{
		int count = 0,  temp = 0;
		int[] arr = {1,1,0,1,0,1,1,0,1,1,1,1,1,0};
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == 0)
			{
				if(count < temp)
					count = 0;
				else
				{
					temp = count;
					count = 0;
				}
			}
			else
			{
				count +=1;
			}					
			// System.out.print("count: "+ count);
			// System.out.print(" temp: "+ temp);
			// System.out.println();
		}
		if(temp > count)
			System.out.println("Number of consecutive ones are: "+ temp);
		else
			System.out.println("Number of consecutive ones are: "+ count);
	}

}
