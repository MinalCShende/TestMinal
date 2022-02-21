package src;
//Assignment 7

public class Shop {
	int maggi=50;
	int dosa=43;
	int oil=39;
	int panipuri=43;
	int masala=73;
	
	void maggiQuantity(int quantity) {
		if(maggi<49) {
			System.out.println("Maggi running out of stock");
		}else if(quantity<maggi) { 
			maggi=maggi-quantity;
		    System.out.println(maggi+" maggi available");
		}else if(maggi<1) {
			System.out.println("Maggi is out of stock");
		}
	}
	void dosaQuantity(int quantity) {
		if(dosa<42) {
			System.out.println("Dosa running out of stock");
		}else if(quantity<dosa) {
			dosa=dosa-quantity;
		    System.out.println(dosa+" dosa available");
		}else if(dosa<1) {
			System.out.println("Dosa is out of stock");
		}
	}
	void oilQuantity(int quantity) {
		if(oil<38) {
			System.out.println("Dosa running out of stock");
		}else if(quantity<oil) {
			oil=oil-quantity;
		    System.out.println(oil+" oil pouches available");
		}else if(oil<1) {
			System.out.println("Oil is out of stock");
		}
	}
	void panipuriQuantity(int quantity) {
		if(panipuri<42) {
			System.out.println("Panipuri running out of stock");
		}else if(quantity<panipuri) {
			panipuri=panipuri-quantity;
		    System.out.println(panipuri+" panipuri packets available");
		}else if(panipuri<1) {
			System.out.println("Panipuri is out of stock");
		}
	}
	void masalaQuantity(int quantity) {
		if(masala<73) {
			System.out.println("Masala running out of stock");
		}else if(quantity<masala) {
			masala=masala-quantity;
		    System.out.println(masala+" masala packets available");
		}else if(masala<1) {
			System.out.println("Masala is out of stock");
		}
	}
	
	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.maggiQuantity(12);
		shop.dosaQuantity(30);
		shop.oilQuantity(20);
		shop.panipuriQuantity(43);
		shop.masalaQuantity(70);
		
		
	}

}
