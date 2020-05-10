package java_programs;

import java.util.Scanner;

public class Reverse_word
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word to reverse: ");
		String word = input.nextLine();
		// String word = input.next();
		char[] letters = word.toCharArray();
		for(int i = word.length()-1; i >= 0; i--)
		{
			System.out.print(letters[i]);
		}
	}
	
}
