package Assignments;

import java.util.Scanner;

public class MatrixEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][]=new int [3][3];
		int array2[][]=new int [3][3];
		Scanner s=new Scanner(System.in);
		MatrixEx2 m1=new MatrixEx2();
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
		m1.subtract(array1,array2);
	}

	void subtract(int[][] array1, int[][] array2) {
		// TODO Auto-generated method stub
		int sub[][]=new int [3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sub[i][j]=array1[i][j]-array2[i][j];
			}
		}
		System.out.println("Subraction of Two Martix is : ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}
	}

}
