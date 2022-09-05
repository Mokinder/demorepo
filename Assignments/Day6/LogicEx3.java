package Assignments;

import java.util.Scanner;

public class LogicEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("Enter the size: ");
		size=s.nextInt();
		int array[]=new int [size];
		System.out.println("Enter the elements");
		for(int i=0;i<size-1;i++)
		{
			array[i]=s.nextInt();
		}
		LogicEx3 l=new LogicEx3();
		l.Print(array);
	}

	void Print(int[] array) {
		//TODO Auto-generated method stub
		System.out.println("Elements :");
		for(int i=0;i<array.length-1;i++)
		{
			System.out.print(array[i]);
		}		
	}

}
