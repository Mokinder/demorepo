package Assignment1;

import java.util.Scanner;

class Accounttest {
	String accountname;
	long balance;
	char ans;
	long debit;
	long credit;

	void accountinput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the account name :");
		accountname = s.next();
		System.out.println("Enter the balance :");
		balance = s.nextLong();
		System.out.println("Enter d for debit or c for credit :");
		ans = s.next().charAt(0);
		if ('d' == ans) {
			System.out.println("Enter the amount to debit :");
			debit = s.nextLong();
			Debit(debit);

		} else if ('c' == ans) {
			System.out.println("Enter the amount to credit :");
			credit = s.nextLong();
			Credit(credit);

		}
	}

	void Credit(long credit) {
		// TODO Auto-generated method stub
		balance += credit;
		System.out.println("Account balance after the credit is " + balance);
	}

	void Debit(long debit) {
		// TODO Auto-generated method stub
		if (debit <= balance) {
			balance -= debit;
			System.out.println("Account balance after debit is " + balance);

		} else {
			System.out.println("Debit amount exceeded Account Balance.." + balance);
		}
	}
}

public class Account extends Accounttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account();
		ac.accountinput();
	}
}
