package src;
//Assignment 6
//WAP to find 1. Even numbers, 2. numbers divisible by 5, 3.numbers divisible 5 and 3, 4.numbers divisible by 7 or 13.
public class Loop {
	
	void evenNumbers(int strtNum, int endNum) {
		for(int index=strtNum;index<=endNum;index++) {
			if(index%2==0)
				System.out.println("Even numbers are "+index);
		}
	}
	void divBy5(int strtNum, int endNum) {
		for(int index=strtNum;index<=endNum;index++) {
			if(index%5==0)
				System.out.println("Divisible by 5 numbers are "+index);
		}
		
	}
	void divBy5And3(int strtNum, int endNum) {
		for(int index=strtNum;index<=endNum;index++) {
			if(index%5==0 && index%3==0)
				System.out.println("Divisible by 5 and 3 numbers are "+index);
		}
		
		
	}
	void divBy7Or13(int strtNum, int endNum) {
		for(int index=strtNum;index<=endNum;index++) {
			if(index%7==0 ) {
				System.out.println("Divisible by 7 numbers are "+index);
			}else if(index%13==0) {
				System.out.println("Divisible by 13 numbers are "+index);
			}
		}
		
	}
	public static void main(String[] args) {
		Loop loop=new Loop();
		loop.evenNumbers(1,50);
		loop.divBy5(1,50);
		loop.divBy5And3(1, 50);
		loop.divBy7Or13(1, 200);
	}

}
