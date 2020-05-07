package java_programs;

import java.util.Scanner;

public class Hexadecimal_to_Octal 
{
	public static int hex_system(String hex_value)
	{
		int deci = 0;
		String value = "0123456789ABCDEF";
		hex_value = hex_value.toUpperCase();
		for(int i = 0; i < hex_value.length(); i++)
		{
			char c = hex_value.charAt(i);
			int d = value.indexOf(c);
			deci = deci * 16 + d;
		}
		return deci;
	}

	public static void main(String[] args) 
	{
		int i=1;
		int[] OctalNumber = new int[20];
		String text;
		int decimalNumber;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Hexvalue to convert into Octal Value: ");
		text = input.next();
		decimalNumber = hex_system(text);
		while(decimalNumber != 0)
		{
			OctalNumber[i++] = (int)(decimalNumber % 8);
			decimalNumber = decimalNumber / 8;		
		}
		System.out.print("The Octal Value is: ");
		for(int j = i-1; j > 0; j--)
			System.out.print(OctalNumber[j]);
	}

}
