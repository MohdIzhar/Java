package java_programs;

import java.util.Scanner;

public class Decimal_to_hexadecimal 
{

	public static void main(String[] args) 
	{
		int decimalNumber,remainder;
		String HexValue = "";
		char HexSystem[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		System.out.print("Enter decimal number to convert into Hexadecimal: ");
		Scanner input = new Scanner(System.in);
		decimalNumber = input.nextInt();
		while(decimalNumber != 0)
		{
			remainder = (int)(decimalNumber % 16);
			HexValue = HexSystem[remainder] + HexValue;
			decimalNumber = decimalNumber / 16;
			
		}
		System.out.println("Hexadecimal Value is: "+HexValue);

	}

}
