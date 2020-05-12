package java_programs;

import java.util.Scanner;

public class First_letter_of_each_String 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string1: ");
		char[] str1 = input.next().toCharArray();
		System.out.println("Enter string2: ");
		char[] str2 = input.next().toCharArray();
		if(str1.length > str2.length)
		{
			for(int i = 0; i < str1.length; i++)
			{
				if(i < str1.length && i < str2.length)
				{
					System.out.print(str1[i]);
					System.out.print(str2[i]);
				}
				else
					System.out.print(str1[i]);
			}
		}
		else
		{
			for(int i = 0; i < str2.length; i++)
			{
				if(i < str1.length && i < str2.length)
				{
					System.out.print(str1[i]);
					System.out.print(str2[i]);
				}
				else
					System.out.print(str2[i]);
			}
		}
	}

}
