package Assignments;

import java.util.Scanner;

public class Largestofthree {
	void greatest(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is Largest number.");
			}
			else
			{
				System.out.println(c+" is Largest number.");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is Largest number.");
			}
			else
			{
				System.out.println(c+" is Largest number.");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largestofthree lot=new Largestofthree();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int x,y,z;
		x=s.nextInt();
		y=s.nextInt();
		z=s.nextInt();
		lot.greatest(x,y,z);
	}

}
