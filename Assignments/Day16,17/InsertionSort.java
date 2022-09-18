package Assignment1;

import java.util.*;

public class InsertionSort {
	
	public static void main(String args[])
	{
		String []arr = {"Mokinder", "I","am","from","Minjur"};
		int n = arr.length;
		sort(arr,n);
		showstring(arr, n);
		
	}
		static void sort(String []s, int n)
		{
			for (int i=1 ;i<n; i++)
			{
				String temp = s[i];
				int j = i - 1;
				while (j >= 0 && temp.length() < s[j].length())
				{
					s[j+1] = s[j];
					j--;
				}
				s[j+1] = temp;
			}
		}

		static void showstring(String str[], int n)
		{
			for (int i=0; i<n; i++)
				System.out.print(str[i]+" ");
		}
}
