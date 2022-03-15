package src;

//Assignment 14
/*1. Create a system (Shop) which maintains each item's quantity.(Using Scanner class)

a. Initial stocks of Maggie: 50 Maggie packets 
b. Initial stocks of Dosa : 43 packets 
c. Initial stocks of pouches : 39 oil packets 
d. Initial stocks of panipuri : 43 packets  
e. Initial stocks of masala’s : 73 packets.

Expectation:
1) Only one Customer came for shopping, he picked different items with different quantities, print "running out of stock" message if a particular item is sold out otherwise deduct requested quantity from total quantity. 
2) Create a method which shows only those item which is "Out of stock".
3) Create a method which shows only those item which is "Available in stock" & respective quantities.
*/
import java.util.Scanner;

public class ShopScanner {
		int maggi=50;
		int dosa=43;
		int oil=39;
		int panipuri=43;
		int masala=73;
		
		void maggiQuantity(int quantity) {
			if(quantity==maggi) {
				maggi=maggi-quantity;
				System.out.println("Maggi running out of stock");
			}else if(quantity<maggi) { 
				maggi=maggi-quantity;
			    }
		}
		void dosaQuantity(int quantity) {
			if(quantity==dosa) {
				dosa=dosa-quantity;
				System.out.println("Dosa running out of stock");
			}else if(quantity<dosa) {
				dosa=dosa-quantity;
			    }
		}
		void oilQuantity(int quantity) {
			if(quantity==oil) {
				oil=oil-quantity;
				System.out.println("Dosa running out of stock");
			}else if(quantity<oil) {
				oil=oil-quantity;
			    }
		}
		void panipuriQuantity(int quantity) {
			if(quantity==panipuri) {
				panipuri=panipuri-quantity;
				System.out.println("Panipuri running out of stock");
			}else if(quantity<panipuri) {
				panipuri=panipuri-quantity;
			    }
		}
		void masalaQuantity(int quantity) {
			if(quantity==masala) {
				masala=masala-quantity;
				System.out.println("Masala running out of stock");
			}else if(quantity<masala) {
				masala=masala-quantity;
			    }
		}
		
		void outOfStock() {
			if(maggi==0)
				System.out.println("Maggi is out of stock");
			if(dosa==0)
				System.out.println("Dosa is out of stock");
			if(oil==0)
				System.out.println("Oil is out of stock");
			if(panipuri==0)
				System.out.println("Panipuri is out of stock");
			if(masala==0)
				System.out.println("Masala is out of stock");
		}
		
		void availableInStock() {
			if(maggi>0)
				System.out.println("Maggi is available in stock");
			if(dosa>0)
				System.out.println("Dosa is available in stock");
			if(oil>0)
				System.out.println("Oil is available in stock");
			if(panipuri>0)
				System.out.println("Panipuri is available in stock");
			if(masala>0)
				System.out.println("Masala is available in stock");
			
		}
		
		public static void main(String[] args) {
			ShopScanner shopsc=new ShopScanner();
			Scanner scanner=new Scanner(System.in);
			
			 System.out.println("Enter the Quantity of maggi you want");
			 int input1=scanner.nextInt();
			 shopsc.maggiQuantity(input1);
			 
			 System.out.println("Enter the Quantity of dosa you want");
			 int input2=scanner.nextInt();
			 shopsc.dosaQuantity(input2);
			 
			 System.out.println("Enter the Quantity of oil you want");
			 int input3=scanner.nextInt();
			 shopsc.oilQuantity(input3);
			 
			 System.out.println("Enter the Quantity of panipuri you want");
			 int input4=scanner.nextInt();
			 shopsc.panipuriQuantity(input4);
			 
			 System.out.println("Enter the Quantity of masala you want");
			 int input5=scanner.nextInt();
			 shopsc.masalaQuantity(input5);
			 
			 shopsc.outOfStock();
			 shopsc.availableInStock();
		}

}
