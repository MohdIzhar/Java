package java_programs;

import java.util.Scanner;

public class Reverse_String 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String: ");
		char[] letter = input.nextLine().toCharArray();
		for(int i = letter.length -1; i >= 0; i--)
		{
			System.out.print(letter[i]);
		}
	}

}
