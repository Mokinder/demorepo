package Assignments;

import java.util.Scanner;

public class LogicEx5 {

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
		System.out.println("Even position elements are :");
		for(int i=0;i<=size-1;i++)
		{
			if(i%2==0)
			{
				System.out.print(array[i]);
			}
		}
		
		System.out.println("\nOdd position elements are :");
		for(int i=0;i<size-1;i++)
		{
			if(i%2!=0)
			{
				System.out.print(array[i]);
			}
		}
	}
}
