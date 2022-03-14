package src.array;

//Assignment 17
/*WAP from given number return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45*/


public class FindTargetNum {
	boolean isNumberPresent(int[] input,int targetNum) {
		for(int index=0;index<input.length;index++) {
			if(input[index]==targetNum) {
			return true;
			}else 
				System.out.println("Number "+targetNum+" doesnt found in given array ");
			return false;
		}
		return false;
		
		
	}
	public static void main(String[] args) {
		int[] num= {10,23,23,44,23,10,23,4,23};
		new FrequencyOfTarget().checkFrequency(num, 23);
	}


}
