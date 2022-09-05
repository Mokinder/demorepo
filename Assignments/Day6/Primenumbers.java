package Assignments;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number :");
		number = s.nextInt();
		Primenumbers pr = new Primenumbers();
		pr.prime(number);

	}

	void prime(int number) {
		// TODO Auto-generated method stub
		int temp = 0;
		for( int i=2 ; i <= number ; i++ )
		{
			if( number%i == 0 )
			{
				temp++;
			}
		}
		if(temp == 1)
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is not prime number");
		}
	}

}
