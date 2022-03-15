package src.array;
//Assignment 17
/*WAP from given array return max number.
		input : 22,35,65,88,11,23,45
		output : 88*/


public class MaxNumber {
	
	void getMaxNumber(int[] input) {
		int maxNum=input[0];
		for(int index=0;index<input.length;index++) {
			if(maxNum<input[index])
				maxNum=input[index];
		}
		System.out.println("Maximum number is "+maxNum);
	}
	public static void main(String[] args) {
		int[] num= {22,35,65,88,11,23,45};
		new MaxNumber().getMaxNumber(num);
	}

}
