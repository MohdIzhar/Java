package java_programs;

import java.util.Scanner;

public class Power_of_number 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the digit: ");
		int Digit = input.nextInt();
		System.out.print("Enter the number to calculate that digit is a power of :");
		int Number = input.nextInt();
		int power = 1 , i = 0;
		boolean x = true;
		while(i < Digit && x)
		{
			power = Number * power;
			i++;
			if(power == Digit)
			{
				System.out.println("yes the digit is the power of input number");
				System.out.println("Power is: "+i);
				x = false;
			}
			else if(i < Digit && x)
				continue;
			else
				System.out.println("No power found");
		}
	}

}
