package java_programs;

import java.util.Scanner;

public class Hexadecimal_to_decimal 
{

	public static int hex_system(String HexValue)
	{
		int index, value = 0;
		String hex = "0123456789ABCDEF";
		HexValue = HexValue.toUpperCase();
		for(int i = 0; i < HexValue.length(); i++)
		{ 
			char c = HexValue.charAt(i);
			int d = hex.indexOf(c);
			value = value * 16 + d;
		}
		return value;
	}
	public static void main(String[] args)
	{
		String text;
		int DecimalNumber;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the hexadecimal value: ");
		text = input.next();
		DecimalNumber = hex_system(text);
		System.out.println("Decimal Value is: "+DecimalNumber);

	}

}
