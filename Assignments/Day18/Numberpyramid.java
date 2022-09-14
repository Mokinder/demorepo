package com.bridgelaz;

public class Numberpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberpyramid np=new Numberpyramid();
		np.samenumber();
		np.difnumber();		
	}

	void difnumber() {
		// TODO Auto-generated method stub
		System.out.println("\nTop pyramid : ");
		for(int i=5;i>0;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

	void samenumber() {
		// TODO Auto-generated method stub
		System.out.println("left pyramid :");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i>=j)
				{
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
}
