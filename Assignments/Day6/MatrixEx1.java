package Assignments;

import java.util.Scanner;

public class MatrixEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][]=new int [3][3];
		int array2[][]=new int [3][3];
		Scanner s=new Scanner(System.in);
		MatrixEx1 m1=new MatrixEx1();
		System.out.println("Enter the values for matrix1");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array1[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the values for matrix2");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array2[i][j]=s.nextInt();
			}
		}
		m1.sum(array1,array2);

	}

	void sum(int[][] array1, int[][] array2) {
		// TODO Auto-generated method stub
		int add[][]=new int [3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				add[i][j]=array1[i][j]+array2[i][j];
			}
		}
		System.out.println("Sum of Two Martix is : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
	}
}
