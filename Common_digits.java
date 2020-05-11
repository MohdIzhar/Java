package java_programs;

import java.util.Scanner;

public class Common_digits 
{

	public static void main(String[] args) 
	{
		int Number1, Number2, remainder1, remainder2, temp;
		String common = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		Number1 = input.nextInt();
		System.out.println("Enter Number 2: ");
		Number2 = input.nextInt();
		System.out.println("The digits common in the Numbers are:- ");
		while(Number1 != 0)
		{
			remainder1 = (int)(Number1 % 10);
			// System.out.println("remainder1: "+remainder1);
			temp = Number2;
			while(temp != 0)
			{
				remainder2 = (int)(temp % 10);
				// System.out.println("remainder2: "+remainder2);
				if(remainder1 == remainder2)
				{
					common += Integer.toString(remainder1);
				}
				temp = temp / 10;
			}
			
			Number1 = Number1 / 10;
		}
		System.out.println(common);
	}

}
