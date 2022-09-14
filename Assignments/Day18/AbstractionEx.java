package com.bridgelaz;

abstract class Flower
{
	abstract void jasmin();
}
public class AbstractionEx extends Flower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionEx ae=new AbstractionEx();
		ae.jasmin();

	}

	@Override
	void jasmin() {
		// TODO Auto-generated method stub
		System.out.println("Jasmin");
	}

}
