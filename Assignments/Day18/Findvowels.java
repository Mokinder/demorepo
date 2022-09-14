package com.bridgelaz;

import java.util.Scanner;

public class Findvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the text :");
		text=s.next();
		Findvowels fv=new Findvowels();
		fv.search(text.toLowerCase());

	}

	void search(String text) {
		// TODO Auto-generated method stub
		char vowel[]= {'a','e','i','o','u'};
		int count=0;
		for(int i=0;i<text.length();i++)
		{
			for(int j=i;j<vowel.length;j++)
			{
				if(vowel[j]==text.charAt(i))
				{
					
					count++;
				}
			}
			
		}
		if(count!=0)
		{
			System.out.println(text+" contains Vowels");
		}
		else
		{
			System.out.println(text+" doesn't contains Vowels");
		}
	}

}
