//WAP called bank account details.
package src;

class Bank{
   String username;
   String password;
   int bankAccountNumber;
   
   void setDetails(String name, String pass , int accountNumber){
	  username= name;
      bankAccountNumber=accountNumber; 
      password=pass; 
      
   }
   
   void updatePassword(String updatePass){
	  password=updatePass;
   
   }
   
   void displayInfo(){
	  System.out.println("username is "+username);
      System.out.println("bankAccountNumber is "+bankAccountNumber);
	  System.out.println("password is "+password);
   }
   
   public static void main(String[] args){
	  Bank bank=new Bank();
      bank.setDetails("Minal Shende", "chemin", 1234);
      bank.updatePassword("chemin0108");
      bank.displayInfo();
      System.out.println();
   }
}