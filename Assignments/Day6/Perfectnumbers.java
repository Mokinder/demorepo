package Assignments;

import java.util.Scanner;

public class Perfectnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number :");
		number=s.nextInt();
		Perfectnumbers pn=new Perfectnumbers();
		pn.perfect(number);
	}

	void perfect(int number) {
		// TODO Auto-generated method stub
		int temp=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				System.out.print(i+" ");
				temp+=i;
			}
		}
		System.out.println();
		if(number == temp)
		{
			System.out.println(number+" is a perfect number");
		}
	}

}
