package src.array;

//Assignment 17

/*WAP for given array, return the index having maximum length from given string array.
		input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
*/

public class MaxLengthIndex2 {
	
	void maxLengthIndex(String[] input) {
		int maxIndex=0;
		for(int index=0;index<input.length;index++) {
			if(input[maxIndex].length()<input[index].length()) {
				maxIndex=index;
			}
		}
		System.out.println(maxIndex);
	}
	public static void main(String[] args) {
		String[] name= {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		new MaxLengthIndex2().maxLengthIndex(name);
	}
}