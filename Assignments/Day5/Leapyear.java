package Assignments;

import java.util.*;

public class Leapyear {
	
	void lp(int yr)
	{   
		if(yr%4==0)
		{
			if(yr%400==0)
			{
				System.out.println(yr+" is a Leap Year..");
			}
			else
			{
				System.out.println(yr+" is not Leap Year..");
			}
		}
		else
		{
			System.out.println(yr+" is not Leap Year..");
		}
	}

	public static void main(String[] args) {
		
	Leapyear l=new Leapyear();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the year : ");
    int y=s.nextInt();
    int len = String.valueOf(y).length();
	if(len==4)
	{
      l.lp(y);
	}
	else
	{
		System.out.println("pls..enter properly..");
	}
	}

}
