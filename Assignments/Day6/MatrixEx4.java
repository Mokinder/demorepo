package Assignments;

import java.util.Scanner;

public class MatrixEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][]=new int [3][3];
		Scanner s=new Scanner(System.in);
		MatrixEx4 m1=new MatrixEx4();
		System.out.println("Enter the values for matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array1[i][j]=s.nextInt();
			}
		}
		m1.lowermatrix(array1);
		m1.uppermatrix(array1);
	}

	void lowermatrix(int[][] array1) {
		// TODO Auto-generated method stub
		System.out.println("Lower Triangle : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i>=j)
				{
					System.out.print(array1[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

	void uppermatrix(int[][] array1) {
		// TODO Auto-generated method stub
		System.out.println("Upper Triangle : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i<=j)
				{
				   System.out.print(array1[i][j]+" ");
				}
			}
			System.out.println();
		}

		
	}

}
