package Assignments;

import java.util.Scanner;

public class SwaptwoNos {
	void swap(int a,int b) {
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swaping x is "+a+" y is "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x,y;
		System.out.println("Enter two numbers x and y :");
		x=s.nextInt();
		y=s.nextInt();
		System.out.println("Before Swaping x is "+x+" y is "+y);
		SwaptwoNos sw=new SwaptwoNos();
		sw.swap(x, y);

	}

}
