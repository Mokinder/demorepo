package Assignments;

import java.util.Scanner;

public class LogicEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("Enter the size: ");
		size=s.nextInt();
		int array[]=new int [size];
		System.out.println("Enter the elements");
		for(int i=0;i<=size-1;i++)
		{
			array[i]=s.nextInt();
		}
		LogicEx7 l=new LogicEx7();
		System.out.println("Sum of all iterms is : "+l.sum(array));

	}

	int sum(int[] array) {
		// TODO Auto-generated method stub
		int add=0;
		for(int i=0;i<=array.length-1;i++)
		{
			add+=array[i];
		}
		return add;
	}
}
