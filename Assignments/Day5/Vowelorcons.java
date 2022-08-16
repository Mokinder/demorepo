package Assignments;

import java.util.*;

public class Vowelorcons {
	void vowels(char h)
	{
		char vw[]= {'a','e','i','o','u'};
		int t=0;
		for(int i=0;i<5;i++)
		{
			if(vw[i]==Character.toLowerCase(h))
			{
				t++;
			}
		}
		if(t==1)
		{
			System.out.println(h+" is a Vowel..");
		}
		else
		{
			System.out.println(h+" is a Conconant..");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowelorcons vc=new Vowelorcons();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Alphabet : ");
		char c=s.next().charAt(0);
		vc.vowels(c);
	}

}
