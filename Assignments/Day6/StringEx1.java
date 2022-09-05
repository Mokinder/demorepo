package Assignments;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int count=0;
		Scanner s = new Scanner(System.in);
		StringEx1 st1 = new StringEx1();
		System.out.println("Enter the String :");
		name=s.next();
		for(int i = 0; i < name.length(); i++)
		{
			count++;
		}
		System.out.println("number of characters in given string is :"+count);
		st1.punctuation(name);
		st1.vowels(name.toLowerCase());
	}

	void vowels(String name) {
		// TODO Auto-generated method stub
		int count = 0;
		char vowel[] = {'a','e','i','o','u'};
		for(int i = 0; i < name.length(); i++)
		{
			for(int j = 0; j < vowel.length; j++)
			{
				if( name.charAt(i) == vowel[j] )
				{
					count++;
				}
			}
		}
		System.out.println("The number of Vowels is "+count);
		System.out.println("The number of Consonants is "+(name.length()-count));
	}

	void punctuation(String name) {
		// TODO Auto-generated method stub
		char punch[]= {'!','@','#','$','%','^','&','(',')','_',',',';','<','>','/','.','[',']',':','?'};
		int count=0;
		for(int i = 0;i < name.length(); i++)
		{
			for(int j = 0;j < punch.length; j++)
			{
				if(name.charAt(i) == punch[j])
				{
					count++;
				}
			}
		}
		System.out.println("The numbers of punctuations in the string is "+count);
	}
}
