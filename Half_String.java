package java_programs;

import java.util.Scanner;

public class Half_String 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String text = input.nextLine();
		char[] letters = text.toCharArray();
		if(text.length() % 2 == 0)
		{
			for(int i = 0; i < text.length() / 2; i++)
			{
				System.out.print(letters[i]);
			}
		}
		else
		{
			System.out.println("String is not even");
		}
	}

}
