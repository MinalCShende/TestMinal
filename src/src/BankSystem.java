package src;

//Assignment 9
/*Create a Banking System which has the following functionality.

Create two object to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times individually debit, credit & printBalance method called .
Hint : Create 3 non static instance variable.
Output :
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output :
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time
*/


public class BankSystem {
	String name;
	int debit;
	int credit;
	int balance;
	int debitCount=0;
	int creditCount=0;
	int printBalanceCount=0;
	
	static int totalCredit=0;
	static int totalDebit=0;
	static int totalBalance=0;
	
	void setDetaila(int initialBalance,String custName) {
		balance=initialBalance;
		name=custName;
	}
	
	void debitAmount(int amount) {
		if(amount<balance) {
			balance=balance-amount;
			debitCount++;
			totalCredit++;
		}
		
	}
	void creditAmount(int amount) {
		balance=balance+amount;
		creditCount++;
		totalDebit++;
		
	}
	void printBalance() {
		printBalanceCount++;
		totalBalance++;
	}
	void individualTransactionSummary() {
		System.out.println(name+" : Credit - "+creditCount+" times, Debit - "+debitCount+" times, PrintBalance - "+printBalanceCount+" times");
		
	}
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - "+totalCredit+" times, Debit - "+totalDebit+" times, PrintBalance - "+totalBalance+" times");
		
	}
	public static void main(String[] args) {
		BankSystem bankSystem1=new BankSystem();
		BankSystem bankSystem2=new BankSystem();
		
		bankSystem1.setDetaila(20000,"Manoj");
		bankSystem1.debitAmount(4000);
		bankSystem1.creditAmount(1000);
		bankSystem1.debitAmount(4000);
		bankSystem1.printBalance();
		bankSystem1.creditAmount(1000);
		bankSystem1.individualTransactionSummary();
		
		bankSystem2.setDetaila(10000,"Rani");
		bankSystem2.debitAmount(2000);
		bankSystem2.creditAmount(5000);
		bankSystem2.printBalance();
		bankSystem2.individualTransactionSummary();
		
		bankSystem1.allTransactionSummary();
		
	}

}
