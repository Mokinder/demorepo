package com.bridgelaz;

public class DecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 85, 5, 88, 95, 2, 1, 75, 45, 3, 6 };
		DecendingOrder dr = new DecendingOrder();
		dr.decending(array);

	}

	void decending(int[] array) {
		// TODO Auto-generated method stub
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is :");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
