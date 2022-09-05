package com.bridgelaz;

public class Eleminatzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "0000bri0d00ge00la0bz";
		System.out.println("Before : " + str);
		Eleminatzero et = new Eleminatzero();
		str = et.eleminate(str);
		System.out.println("After : " + str);

	}

	String eleminate(String str) {
		// TODO Auto-generated method stub
		String s = " ";
		int i = 0;
		while (i <= str.length() - 1) {
			if ('0' != str.charAt(i)) {
				s += str.charAt(i);
			}
			i++;
		}
		return s;
	}

}
