package com.bridgelaz;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		String st = "pratik";
		d.rever(st);
	}

	void rever(String s) {
		System.out.println(s);
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
