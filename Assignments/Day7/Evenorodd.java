package com.bridgelaz;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Evenorodd eo=new Evenorodd();
		eo.evenodd(ary);
	}

	void evenodd(int[] ary) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < ary.length) {
			if (i % 2 != 0) {
				System.out.println(ary[i] + " is Even number.");
			} else {
				System.out.println(ary[i] + " is Odd number.");
			}
			i++;
		}		
	}

}
