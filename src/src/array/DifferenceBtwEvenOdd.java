package src.array;

//Assignment 17

 /*return a difference between sum of even number and odd numbers.	
		From given numbers, count the odd and even numbers.
		input : 10,23,26,27,88,87,65 */


public class DifferenceBtwEvenOdd {
	int evenSum, oddSum;
	
	int getDifference(int[] input) {
		for(int index=0;index<input.length;index++) {
			if(input[index]%2==0) {
				evenSum=evenSum+input[index];
				System.out.println();
			}else
				oddSum=oddSum+input[index];
		}
		int diff=evenSum-oddSum;
		System.out.println("Difference beetween Evennumber sum and Oddnumber sum is : "+diff);
		return diff;
		}
	
	public static void main(String[] args) {
		int[] num= {10,23,26,27,88,87,65};
		new DifferenceBtwEvenOdd().getDifference(num);
		}
}
