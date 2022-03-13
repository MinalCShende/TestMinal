package src;

//Assignment 14
/*WAP Calculator using Scanner class.*/

import java.util.Scanner;

public class CalculatorScanner {
	
	 void add( double x, double y){
		   double answer=x+y;
			System.out.println("Addition of two variable is "+answer);
		}
		 void sub( double x, double y){
			double answer=x-y;
	        System.out.println("Substraction of two variable is "+answer);		
		}
		
		 void mult( double x, double y){
			double answer=x*y;
			 System.out.println("Multiplication of two variable is "+answer);
		}

	     void div( double x, double y){
			 double answer=x/y;
			 System.out.println("Division of two variable is "+answer);
		 }
		 public static void main(String[] args){
			 CalculatorScanner calculatorScanner= new CalculatorScanner();
			 Scanner scanner=new Scanner(System.in);
			 
			 System.out.println("Enter the numbers you want to add");
			 double input1=scanner.nextDouble();
			 double input2=scanner.nextDouble();
             calculatorScanner.add(input1, input2);
			 
			 System.out.println("Enter the numbers you want to subtract");
			 double input3=scanner.nextDouble();
			 double input4=scanner.nextDouble();
			 calculatorScanner.sub(input3, input4);
			 
			 System.out.println("Enter the numbers you want to multiply");
			 double input5=scanner.nextDouble();
			 double input6=scanner.nextDouble();
			 calculatorScanner.mult(input5, input6);
			 
			 System.out.println("Enter the numbers you want to divide");
			 double input7=scanner.nextDouble();
			 double input8=scanner.nextDouble();
			 calculatorScanner.div(input7, input8);
		 }

}
