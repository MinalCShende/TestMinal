package src.array;

//Assignment 17
/* WAP from given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23*/


public class FrequencyOfTarget {
	
	void checkFrequency(int[] input,int targetNum) {
		int targetCount=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]==targetNum)
				targetCount++;
		}
		System.out.println("Frequency of "+targetNum+" is :"+targetCount);
	}
	public static void main(String[] args) {
		int[] num= {10,23,23,44,23,10,23,4,23};
		new FrequencyOfTarget().checkFrequency(num, 23);
	}

}
