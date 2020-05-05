package java_programs;

import java.util.Scanner;

public class Decimal_to_octal 
{

	public static void main(String[] args) 
	{
		int DecimalNumber,i=1,j;
		int[] OctalNumber = new int[20];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Decimal Number to convert to Octal Number: ");
		DecimalNumber = input.nextInt();
		while(DecimalNumber != 0)
		{
			OctalNumber[i++] = (int)(DecimalNumber % 8);
			DecimalNumber = DecimalNumber / 8;
		}
		System.out.println("Octal Number is: ");
		for(j = i-1; j > 0; j--)
		{
			System.out.print(OctalNumber[j]);
		}

	}

}
