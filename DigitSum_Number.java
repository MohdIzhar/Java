package java_programs;

import java.util.Scanner;

public class DigitSum_Number 
{

	public static void main(String[] args) 
	{
		int Number, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number to find the sum of its digit: ");
		Number = input.nextInt();
		while(Number != 0)
		{
			sum = sum + (int)(Number % 10);
			Number = Number / 10;
		}
		System.out.print("Sum of its digit is: "+sum);
	}

}
