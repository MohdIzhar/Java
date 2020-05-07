package java_programs;

import java.util.Scanner;

public class Hexadecimal_to_binary 
{
	public static int hex_system(String HexValue)
	{
		int value = 0;
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
		int decimalNumber,i=1,j;
		int[] binary = new int[100];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the hexadecimal value: ");
		text = input.next();
		decimalNumber = hex_system(text);
		System.out.println("Decimal Value is: "+decimalNumber);
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
