package Assignments;

import java.util.Scanner;

public class PowerOftwos {
	void pw(int no)
	{
		for(int i=1;i<=no;i++)
		{
			int m=(int)Math.pow(2,i);
			System.out.println("2 * "+i+" = "+m);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerOftwos p=new PowerOftwos();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the N value : ");
		int n=s.nextInt();
        if((0<=n)&&(n<31))
        {
        	p.pw(n);
        }
        else
        {
        	System.out.println("Enter the number within 31");
        }
	}

}
