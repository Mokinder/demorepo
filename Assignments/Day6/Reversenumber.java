package Assignments;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		number = s.nextInt();
		Reversenumber rv = new Reversenumber();
		rv.reverse(number);

	}

	void reverse(int number) {
		// TODO Auto-generated method stub
		int rev=0;
		int n;
		int len=String.valueOf(number).length();
		for(int i=0;i<len;i++)
		{
			n=number%10;
			rev=rev*10+n;
			number=number/10;
		}
		System.out.println("The reversed number is "+rev);
	}

}
