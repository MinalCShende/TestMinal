//WAP called Calculator, which has 4 methods.
//add, sub, mult, div.
//2 instance variable x = 20,y = 5.
//1 local variable answer and print the answer in every induvisual method.
package src;

class Calculator{
     int x=20;
	 int y=5;
	 
	 void add(){
	    int answer=x+y;
		System.out.println("Addition of two variable is "+answer);
	}
	 void sub(){
		int answer=x-y;
        System.out.println("Substraction of two variable is "+answer);		
	}
	
	 void mult(){
		 int answer=x*y;
		 System.out.println("Multiplication of two variable is "+answer);
	}

     void div(){
		 int answer=x/y;
		 System.out.println("Division of two variable is "+answer);
	 }
	 public static void main(String[] args){
		 Calculator calculator= new Calculator();
		 calculator.add();
		 calculator.sub();
		 calculator.mult();
		 calculator.div();
	 }
}
