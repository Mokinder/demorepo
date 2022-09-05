package Assignments;

import java.util.Scanner;

public class MatrixEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][]=new int [3][3];
		int array2[][]=new int [3][3];
		Scanner s=new Scanner(System.in);
		MatrixEx3 m1=new MatrixEx3();
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
		m1.multiply(array1,array2);

	}

	void multiply(int[][] array1, int[][] array2) {
		// TODO Auto-generated method stub
		int mull[][]=new int [3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					mull[i][j]+=array1[i][k]*array2[k][j];
				}
			}
		}
		System.out.println("Multiplication of Two Martix is : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(mull[i][j]+" ");
			}
			System.out.println();
		}
	}

}
