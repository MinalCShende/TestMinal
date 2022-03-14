package src;

import java.util.Scanner;

//Assignment 15

/*A person has total 4 accounts in ICICI, HDFC, BOB, SBI one in each.
a) Person can debit or credit amount from respective bank.
    Hint : Switch case is expected here. [Please watch today's recording again, in case of confusion.]

b) A Method to show total balance [ICICI balance + HDFC balance + BOB balance + SBI Balance]

c) A Method to show total credit, debit operations 
       output : Total credit operation - 7 times
                    Total debit operation - 5 times

d) A Method to show individual bank credit operations.
      output : ICICI bank Credit Operation - 2
               HDFC bank Credit Operation - 2
               SBI bank Credit Operation - 1
               BOB bank Credit Operation - 4
               
e) A Method to show individual bank debit operations.
                output : ICICI bank Debit Operation - 2
                         HDFC bank Debit Operation - 2
		                 SBI
             
*/

public class BankOperation {
	int iciciBalance=5000, hdfcBalance=6000, bobBalance=3000, sbiBalance=9000;
	int iDebitCount=0, iCreditCount=0, hDebitCount=0, hCreditCount=0, bDebitCount=0, bCreditCount=0, sDebitCount=0,sCreditCount=0;
	
	void oprations(String opr,String bank,int amt) {
		switch(opr) {
		      case "debit":
			       switch(bank) {
			             case "ICICI":
			    	          if(iciciBalance>=amt)
			    	        	  iciciBalance=iciciBalance-amt;
			    	          else
			    	        	  System.out.println("Not sufficient balance");
			    	          iDebitCount++;
			    	     break;
			    	     
			             case "HDFC":
			    	          if(hdfcBalance>=amt)
			    	        	  hdfcBalance=hdfcBalance-amt;
			    	          else
			    	        	  System.out.println("Not sufficient balance");
			    	          hDebitCount++;
			    	     break;
			    	     
			             case "BOB":
			    	          if(bobBalance>=amt)
			    	        	  bobBalance=bobBalance-amt;
			    	          else
			    	        	  System.out.println("Not sufficient balance");
			    	          bDebitCount++;
			    	     break;
			    	          
			             case "SBI":
			    	          if(sbiBalance>=amt)
			    	        	  sbiBalance=sbiBalance-amt;
			    	          else
			    	        	  System.out.println("Not sufficient balance");
			    	          sDebitCount++;
			    	     break;
			    	     
			    	     default :
			    	    	 System.out.println("Invalid Bank");
			    	    	 
			    	}
		      case "credit":
		    	  switch(bank) {
		             case "ICICI":
		    	        	  iciciBalance=iciciBalance+amt;
		    	        	  iCreditCount++;
		    	     break;
		    	     
		             case "HDFC":
		    	        	  hdfcBalance=hdfcBalance+amt;
		    	        	  hCreditCount++;
		    	     break;
		    	     
		             case "BOB":
		    	        	  bobBalance=bobBalance+amt;
		    	        	  bCreditCount++;
		    	     break;
		    	          
		             case "SBI":
		    	        	  sbiBalance=sbiBalance+amt;
		    	        	  sCreditCount++;
		    	     break;
		    	     
		             default :
		    	    	 System.out.println("Invalid Bank");
		          }
         }
	}
	void totalBalance() {
		int totalBalance=iciciBalance+hdfcBalance+bobBalance+sbiBalance;
		System.out.println("Total balance is "+totalBalance);
	}
	
	void totalCreditDbitOpr() {
		int totalCreditOpr=iCreditCount+hCreditCount+bCreditCount+sCreditCount; 
		int totalDebitOpr=iDebitCount+hDebitCount+bDebitCount+sDebitCount;
		System.out.println("Total credit operation - "+totalCreditOpr+" times");
		System.out.println("Total debit operation - "+totalDebitOpr+" times");
	}
	
	void individualBankCreditOpr() {
		System.out.println("ICICI bank credit operation- "+iCreditCount);
		System.out.println("HDFC bank credit operation- "+hCreditCount);
		System.out.println("BOB bank credit operation- "+bCreditCount);
		System.out.println("SBI bank credit operation- "+sCreditCount);
	}
	
	void individualBankDebitOpr() {
		System.out.println("ICICI bank debit operation- "+iDebitCount);
		System.out.println("HDFC bank debit operation- "+hDebitCount);
		System.out.println("BOB bank debit operation- "+bDebitCount);
		System.out.println("SBI bank debit operation- "+sDebitCount);
	}
	public static void main(String[] args) {
		BankOperation bankOpr=new BankOperation();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("credit or debit");
		String input1=scanner.next();
		System.out.println("Enter the bank name");
		String input2=scanner.next();
		System.out.println("Enter the ammount");
		int input3=scanner.nextInt();
		bankOpr.oprations(input1, input2, input3);
		
		bankOpr.totalBalance();
		bankOpr.totalCreditDbitOpr();
		bankOpr.individualBankCreditOpr();
		bankOpr.individualBankDebitOpr();
		
		
	}

	
}
