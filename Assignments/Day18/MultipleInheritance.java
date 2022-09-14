package com.bridgelaz;

interface multipleA {
	abstract void area();

}

interface multipleB {
	abstract void display();
}

class Square implements multipleA, multipleB {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("mutiple B");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("multiple A");
	}

}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square S1 = new Square();
		S1.area();
		S1.display();

	}

}
