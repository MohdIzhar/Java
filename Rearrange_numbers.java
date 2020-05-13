package java_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Rearrange_numbers
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the numbers of elements: ");
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter number "+(i+1)+": ");
			arr[i] = input.nextInt();
		}
		int temp;
		int i = 0;
		System.out.println("Original Array: "+Arrays.toString(arr)); 
	    while(i < arr.length && arr[i] % 2 == 0)
	        i++;
		for(int j = i; j < arr.length; j++)
		{
			if(arr[j] % 2 != 0)
			{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		System.out.println("New Array: "+Arrays.toString(arr));
	}

}
