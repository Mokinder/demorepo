package Assignments;

import java.util.Scanner;

public class MatrixEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][]=new int [3][3];
		Scanner s=new Scanner(System.in);
		MatrixEx5 m1=new MatrixEx5();
		System.out.println("Enter the values for matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array1[i][j]=s.nextInt();
			}
		}
		System.out.println("Given Matrix :");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}	
		m1.transpose(array1);

	}

	void transpose(int[][] array1) {
		// TODO Auto-generated method stub
		System.out.println("Transpose Matrix : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array1[j][i]+" ");
			}
			System.out.println();
		}	
	}
}
