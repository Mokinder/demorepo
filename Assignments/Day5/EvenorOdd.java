package Assignments;

import java.util.Scanner;

public class EvenorOdd {
	void evod(int no) {
		if(no%2==0)
		{
			System.out.println(no+" is Even Number.");
		}
		else
		{
			System.out.println(no+" is Odd Number.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenorOdd eo =new EvenorOdd();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=s.nextInt();
	    eo.evod(n);
	}

}
