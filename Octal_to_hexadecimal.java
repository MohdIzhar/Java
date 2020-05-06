package java_programs;

import java.util.Scanner;

public class Octal_to_hexadecimal
{

	public static void main(String[] args) 
	{
		int OctalNumber, DecimalNumber = 0, oct_value = 1, remainder;
		char HexSystem[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String HexValue = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the OctalNumber");
		OctalNumber = input.nextInt();
		while(OctalNumber != 0)
		{
			remainder = (int)(OctalNumber % 10);
			DecimalNumber = DecimalNumber + (remainder * oct_value);
			oct_value = oct_value * 8;
			OctalNumber = OctalNumber / 10;
		}
		System.out.println("The decimal value is: "+DecimalNumber);
		while(DecimalNumber != 0)
		{
			remainder = (int)(DecimalNumber % 16);
			HexValue =  HexSystem[remainder] +  HexValue ;
			DecimalNumber = DecimalNumber / 16;
		}
		System.out.println("The Hexadecimal value is: "+HexValue);
	}
}
