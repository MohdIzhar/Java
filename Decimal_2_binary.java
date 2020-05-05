package java_programs;

import java.util.Scanner;

public class Decimal_2_binary 
{

	public static void main(String[] args) 
	{
		int decimalNumber, i=1,j;
		int[] binary = new int[20];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter decimal number to convert binary: ");
		decimalNumber = input.nextInt();
		while(decimalNumber != 0)
		{
			binary[i++] = (int)(decimalNumber % 2);
			decimalNumber = decimalNumber / 2;
		}
		System.out.println("Binary Value of input Decimal Number is: ");
		for(j = i-1 ; j > 0; j--)
		{
			System.out.print(binary[j]);
		}
	}

}
