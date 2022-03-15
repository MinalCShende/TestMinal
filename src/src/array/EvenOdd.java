package src.array;

//Assignment 17
/* WAP from given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 */ 


public class EvenOdd {
	int evenCount=0;
	void printEvenNum(int[] input) {
		for(int index=0;index<input.length;index++) {
			if(index%2==0)
			    evenCount++;
			}
		System.out.println("Even :"+evenCount);
		int oddCount=input.length-evenCount;
		System.out.println("Odd :"+oddCount);
	}
	public static void main(String[] args) {
		int[] num= {10,23,26,27,88,87,65};
		new EvenOdd().printEvenNum(num);
	}

}
