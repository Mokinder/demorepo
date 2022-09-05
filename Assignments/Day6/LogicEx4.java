package Assignments;

import java.util.Scanner;

public class LogicEx4 {

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
		LogicEx4 l=new LogicEx4();
		l.Reverse(array);

	}

	void Reverse(int[] array) {
		// TODO Auto-generated method stub
		System.out.println("Reverse Elements :");
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}	
	}

}
