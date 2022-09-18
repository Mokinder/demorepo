package Assignment1;

import java.util.Scanner;

class Stock{
	String stockname;
	int no_stock=0;
	int no_share=0;
	long shareprice;
	long totalvalue;
	
	void input()
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number of Stock :");
	    no_stock=s.nextInt();
	    System.out.println("Enter the number of shares :");
	    no_share=s.nextInt();
		System.out.println("Enter the Stock Name :");
		stockname=s.next();
		System.out.println("Enter the Share price :");
		shareprice=s.nextLong();
				
	}
	void calculate()
	{
		totalvalue=no_stock*no_share*shareprice;
		
	}
	void output()
	{
		System.out.println("The total value of Stock is "+totalvalue);
	}
}



public class StockPortfolio extends Stock {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockPortfolio stp= new StockPortfolio();
		StockPortfolio stp1= new StockPortfolio();
		stp.input();
		stp.calculate();
		stp.output();
		stp1.input();
		stp1.calculate();
		stp1.output();
	}

}
