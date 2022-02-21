package src;
//Assignment4
//WAP to find maximum and minimum number.
public class NumberGame {
	int num1; 
	int num2;
	int num3;
	void findMaxNumber(int a,int b,int c) {
		if(a==b&&b==c) {
			System.out.println("Maximum numbers are could not find,all the given numbers are identical  ");
		}else if(a>b&&a>c) {
			System.out.println( "Maximum number is  "+a);
		}else if(b>c) {
			System.out.println("Maximum number is  "+b);
		}else {
			System.out.println("Maximum number is  "+c);
		} 
		
	}
	
	void findMinNumber(int a,int b,int c) {
		if(a==b&&b==c) {
			System.out.println("Minimum numbers are could not find,all the given numbers are identical  ");
		}else if(a>b&&a>c) {
			System.out.println( "Minimum number is  "+a);
		}else if(b>c) {
			System.out.println("Minimum number is  "+b);
		}else {
			System.out.println("Minimum number is  "+c);
		} 
	} 
	public static void main(String[] args) {
		NumberGame numbergame=new NumberGame();
		numbergame.findMaxNumber(65, 45, 4);
		numbergame.findMaxNumber(4, 4, 4);
		numbergame.findMinNumber(65, 45, 4);
		numbergame.findMinNumber(5, 5, 5);
		
	}

}
