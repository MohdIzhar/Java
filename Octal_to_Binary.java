package java_programs;

import java.util.Scanner;

public class Octal_to_Binary
{

	public static void main(String[] args) 
	{
		int OctalNumber, remainder, i = 1;
		long[] BinaryNumber = new long[50];
		int OctalSystem[] = {0,1,10,11,100,101,110,111};
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the OctalNumber");
		OctalNumber = input.nextInt();
		while(OctalNumber != 0)
		{
			remainder = (int)(OctalNumber % 10);
			BinaryNumber[i++] = OctalSystem[remainder];
			OctalNumber = OctalNumber / 10;
		}
		System.out.println("The binary value is: ");
		for(int j = i-1; j > 0; j--)
			System.out.print(BinaryNumber[j]);
	}

}
