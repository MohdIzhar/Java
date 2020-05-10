package java_programs;

import java.util.Scanner;

public class Capitalize_each_word 
{

	public static void main(String[] args)
	{
		String text;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		text = input.nextLine();
		Scanner LineScan = new Scanner(text);
		String upper_case = "";
		while(LineScan.hasNext())
		{
			// System.out.println(LineScan.next());
			String word = LineScan.next();
			// System.out.println(word.toUpperCase().charAt(0));
			upper_case = upper_case + word.toUpperCase().charAt(0) + word.substring(1) + " ";	
		}
		System.out.println(upper_case.trim());
	}

}
