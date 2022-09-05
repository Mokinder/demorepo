package com.bridgelaz;

import java.util.Scanner;

public class Wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = s.next();
		Wordcount wc = new Wordcount();
		wc.count(str.toLowerCase());

	}

	void count(String str) {
		// TODO Auto-generated method stub
		int ac = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			if ('a' == str.charAt(i)) {
				ac++;
			}
		}
		if (ac != 0) {
			System.out.println("'a' count in given " + str + " is " + ac);
		} else {
			System.out.println("There is no 'a' character in " + str);
		}

	}

}
