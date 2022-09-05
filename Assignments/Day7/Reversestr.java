package com.bridgelaz;

import java.util.Scanner;

public class Reversestr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = s.next();
		System.out.println("Before : " + str);
		Reversestr r = new Reversestr();
		str = r.reverse(str);
		System.out.print("After : " + str);

	}

	String reverse(String str) {
		String st = " ";
		int i = str.length() - 1;
		while (i >= 0) {
			st += str.charAt(i);
			i--;
		}
		return st;
	}
}
