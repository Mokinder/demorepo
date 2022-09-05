package com.bridgelaz;

public class Arrayshift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0 };
		Arrayshift shift = new Arrayshift();
		shift.shiftZeros(array);

	}

	void shiftZeros(int[] array) {
		// TODO Auto-generated method stub
		int size = array.length;
		int j = 0;
		int shiftedarray[] = new int[size];
		for (int i = 0; i <= size - 1; i++) {
			if (array[i] == 0) {
				shiftedarray[j] = array[i];
				j++;
			}
		}
		for (int i = 0; i <= size - 1; i++) {
			if (array[i] == 1) {
				shiftedarray[j] = array[i];
				j++;
			}
		}
		for (int i = 0; i <= size - 1; i++) {
			System.out.print(shiftedarray[i]);
		}
	}

}
