package com.bridgelaz;

import java.util.Comparator;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array[] = { "Red", "Blue", "Green", "Yellow", "Orange" };
		Color c1 = new Color();
		c1.show(array);
	}

	void show(String[] array) {
		// TODO Auto-generated method stub
		char j = ',';
		char g = '.';
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				System.out.print(array[i] + g);
			} else {
				System.out.print(array[i] + j);
			}
		}
	}
}
