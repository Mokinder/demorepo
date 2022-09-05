package Assignments;

import java.util.Scanner;

public class LogicEx8 {

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
		LogicEx8 l=new LogicEx8();
		System.out.println("Elements : ");
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.print(array[i]+",");
		}
		l.accending(array);
		l.decending(array);

	}

	void decending(int[] array) {
		// TODO Auto-generated method stub
		int des=0;
		for(int i=0;i<=array.length-1;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]<array[j])
				{
					des=array[i];
					array[i]=array[j];
					array[j]=des;
				}
			}
		}
		System.out.println("\nDecending Ordered Array is :");
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.print(array[i]+",");
		}
		
	}

	void accending(int[] array) {
		// TODO Auto-generated method stub
		int asc=0;
		for(int i=0;i<=array.length-1;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]>array[j])
				{
					asc=array[i];
					array[i]=array[j];
					array[j]=asc;
				}
			}
		}
		System.out.println("\nAscending Ordered Array is :");
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.print(array[i]+",");
		}
	}
}
