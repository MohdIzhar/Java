package java_programs;

import java.util.Scanner;

public class Binary_to_hexadecimal 
{

	public static void main(String[] args) 
	{
		int BinaryNumber, DecimalNumber = 0, remainder, i = 1;
		String HexValue = "";
		char HexSystem[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Binary Number: ");
		BinaryNumber = input.nextInt();
		while(BinaryNumber != 0)
		{
			remainder = (int)(BinaryNumber % 10);
			DecimalNumber = DecimalNumber + remainder * i;
			i = i * 2;
			BinaryNumber = BinaryNumber / 10;
		}
		System.out.println("Decimal Value of input number is: "+ DecimalNumber);
		while( DecimalNumber != 0)
		{
			remainder = DecimalNumber % 16;
			HexValue = HexValue + HexSystem[remainder];
			DecimalNumber = DecimalNumber / 16;
		}
		System.out.print("HexaDecimal Value of input number is: "+ HexValue);
		
	}

}
