package com.bridgelaz;

import java.util.Scanner;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str, rev;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String :");
		str = s.next();
		Stringdemo sd = new Stringdemo();
		rev = sd.reverse(str);
		System.out.println("The Reversed String is : " + rev);
		sd.palindrome(str, rev);
	}

	void palindrome(String str, String rev) {
		// TODO Auto-generated method stub
		if (str.equals(rev)) {
			System.out.println("It is palindrome..");
		} else {
			System.out.println("It is not palindrome..");
		}
	}

	String reverse(String str) {
		// TODO Auto-generated method stub
		String rstringreverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rstringreverse += str.charAt(i);
		}
		return rstringreverse;
	}
}
