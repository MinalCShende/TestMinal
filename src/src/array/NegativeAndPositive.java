package src.array;

//Assignment 17

/*WAP from given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 */


public class NegativeAndPositive {
	
	void getCount(int[] input) {
	int positiveCount=0;
	for(int index=0;index<input.length;index++) {
		if(input[index]>0)
			positiveCount++;
		}
	int negativeCount=input.length-positiveCount;
	System.out.println("Positive - "+positiveCount);
	System.out.println("Negative - "+negativeCount);
	}
	public static void main(String[] args) {
		int[] num= {10,23,26,-27,-88,87,-65};
		new NegativeAndPositive().getCount(num);
	}
	
}


