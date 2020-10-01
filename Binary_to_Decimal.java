package java_programs;

import java.util.Scanner;

public class Binary_to_Decimal 
{

	public static void main(String[] args)
	{
		int BinaryNumber, sum = 0, i =1, remainder;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the binary number: ");
		BinaryNumber = input.nextInt();
		while(BinaryNumber != 0)
		{
			remainder = (int)(BinaryNumber % 10);
			sum += remainder * i;
			i *=2;
			BinaryNumber = BinaryNumber / 10;
		}
		System.out.print("Decimal Value is: "+sum);
		
	}

}
