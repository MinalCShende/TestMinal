package src;
//Assignment 5
//WAP 

public class Mall {
	int item;
	String name;
	String payment;
	boolean bill;
	boolean bag;
	String section;
	
	void iteamAddedToCart(int numOfItem) {
		item=numOfItem;
	}
	void customerName(String custName) {
		name=custName;
	}
	void paymentDoneUsing(String paymentMode) {
		payment=paymentMode;
	}
	void displayCustomerInfo() {
		System.out.println(name+" buys "+ item +" items and payment done using "+ payment +" in section "+section);
		System.out.println("Need bill "+bill);
		System.out.println("Need carry bag "+bag);
	}
	void needBill(boolean flag) {
		bill=flag;
	}
	void haveCarryBag(boolean flag) {
		bag=flag;
		
	}
	void decideSection() {
		if(item<10 && payment.equals("cash")) {
			section ="1A";
		}else if(item>10 && payment.equals("visa card")) {
			section ="1B";
		}else if(item>10 && payment.equals("cash")) {
			section ="1C";
		}else if(item<10 && payment.equals("visa card")) {
			section ="1D";
	    }
		
	}
	public static void main(String[] args) {
		Mall mall=new Mall();
		mall.iteamAddedToCart(6);
		mall.customerName("Chetan Shende");
		mall.paymentDoneUsing("visa card");
		mall.needBill(true);
		mall.haveCarryBag(false);
		mall.decideSection();
		mall.displayCustomerInfo();
		
	}

}
