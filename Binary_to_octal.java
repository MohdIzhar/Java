package java_programs;

import java.util.Scanner;

public class Binary_to_octal 
{

	public static void main(String[] args) 
	{
		int BinaryNumber, remainder, pow_of_two = 1;
		int DecimalNumber = 0, index = 1;
		int[] OctalNumber = new int[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Binary Numeber to convert into Octal Number: ");
		BinaryNumber = input.nextInt();
		while(BinaryNumber != 0)
		{
			remainder = (int)(BinaryNumber % 10);
			DecimalNumber = DecimalNumber + remainder * pow_of_two;
			pow_of_two = pow_of_two * 2;
			BinaryNumber = BinaryNumber / 10;
		}
		System.out.println("Decimal Value of input Binary Number is: "+DecimalNumber);
		while(DecimalNumber != 0)
		{
			OctalNumber[index++] = (int) (DecimalNumber % 8);
			DecimalNumber = DecimalNumber / 8;
		}
		System.out.print("Octal Value of input binary number is: ");
		for(int j = index-1; j > 0; j--)
		{
			System.out.print(OctalNumber[j]);
		}
		
	}

}
