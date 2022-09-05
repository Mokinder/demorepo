package Assignments;

import java.util.Scanner;

public class LogicEx6 {

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
		LogicEx6 l=new LogicEx6();
		System.out.println("Largest element is "+l.largest(array));
        System.out.println("Smallest element is "+l.smallest(array));
	}

	int smallest(int[] array) {
		// TODO Auto-generated method stub
		int smal=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					smal=array[i];
				}
				else
				{
					smal=array[j];
				}
			}
		}
		return smal;
	}

	int largest(int[] array) {
		// TODO Auto-generated method stub
		int larg=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					larg=array[i];
				}
				else
				{
					larg=array[j];
				}
			}
		}
		return larg;
	}
}
