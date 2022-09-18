package Assignment1;

import java.util.Scanner;

public class PrimeGivenRange {
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
    // Declare the variables
    int a, b, i, j, flag;

    System.out.println("Enter initial number : ");
    a = sc.nextInt(); 
    System.out.println("\nEnter the last number : ");
    b = sc.nextInt(); 
    System.out.println("\nPrime numbers between"+a+"and "+b+" are: ");
    for (i = a; i <= b; i++) {
        if (i == 1 || i == 0) {
            continue;
        }
        flag = 1;

        for (j = 2; j <= i / 2; ++j) {
            if (i % j == 0) {
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            System.out.println(i);
    }
}
}