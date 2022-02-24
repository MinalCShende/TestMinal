package src;

//Assignment 10
/*Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/


public class Calculator2 {
	
	int add(int x,int y) {
		int z=x+y;
		return z;
	}
	int sub(int x,int y) {
		int z=x-y;
		return z;
	}
	int div(int x,int y) {
		int z=x/y;
		return z;
	}
	int mult(int x,int y) {
		int z=x*y;
		return z;
	}
	void printTotalAnswer(int sumAnswer,int subAnswer,int divAnswer,int multAnswer) {
		int total=sumAnswer+subAnswer+divAnswer+multAnswer;
		System.out.println("total :"+total);
	}
	public static void main(String[] args) {
		Calculator2 calculator2=new Calculator2();
		
		int sumAnswer=calculator2.add(54, 64);
		int subAnswer=calculator2.sub(86, 54);
		int divAnswer=calculator2.div(60, 5);
		int multAnswer=calculator2.mult(42, 5);
		
		calculator2.printTotalAnswer(sumAnswer, subAnswer, divAnswer, multAnswer);
		
	}

}
