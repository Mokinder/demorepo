package Assignments;

import java.util.Scanner;

public class LogicEx9 {

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
		LogicEx9 l=new LogicEx9();
		System.out.println("Elements : ");
		for(int i=0;i<=array.length-1;i++)
		{
			System.out.print(array[i]+",");
		}
		l.largestnos(array);

	}

	void largestnos(int[] array) {
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
		System.out.println("The Largest number is :"+array[0]);
		System.out.println("The 2nd Largest number is :"+array[1]);
		System.out.println("The 3rd Largest number is :"+array[2]);
		System.out.println("The Smallest number is :"+array[array.length-1]);
		System.out.println("The 2nd Smallest number is :"+array[array.length-2]);
	}

}
