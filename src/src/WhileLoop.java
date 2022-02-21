package src;

//Assignment 8
//WAP of assignment 6 using while loop.

public class WhileLoop {
	
	void printEvenNum(int totalNum) {
		int count=1;
		int num=1;
		System.out.println("Even numbers are :");
		while(count<=totalNum) {
			if(num%2==0) {
				System.out.println(count+ " : "+num);
				count=count+1;
			}
			num=num+1;
		}
	}
	void divBy5(int totalNum) {
		int count=1;
		int num=1;
		System.out.println("Divisible by 5 numbers are :");
		while(count<=totalNum) {
			if(num%5==0) {
				System.out.println(count+ " : "+num);
				count=count+1;
			}
			num=num+1;
		}
	}
	void divBy5And3(int totalNum) {
		int count=1;
		int num=1;
		System.out.println("Divisible by 5 and 3 numbers are :");
		while(count<=totalNum) {
			if(num%5==0 && num%3==0) {
				System.out.println(count+ " : "+num);
				count=count+1;
			}
			num=num+1;
		}
	}
	void divBy7Or13(int totalNum) {
		int count=1;
		int num=1;
		System.out.println("Divisible by 7 or 13 numbers are :");
		while(count<=totalNum) {
			if(num%7==0 || num%13==0) {
				System.out.println(count+ " : "+num);
				count=count+1;
			}
			num=num+1;
		}
	}
	public static void main(String[] args) {
		WhileLoop whileLoop=new WhileLoop();
		whileLoop.printEvenNum(4);
		whileLoop.divBy5(5);
		whileLoop.divBy5And3(4);
		whileLoop.divBy7Or13(5);
	}
	

}
