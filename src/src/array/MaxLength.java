package src.array;

//Assignment 17
/*WAP for given array. Return the name having maximum length.
		input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		output : Technocredits*/


public class MaxLength {
	
	void maxLength(String[] input) {
		String maxName=input[0];
		for(int index=0;index<input.length;index++) {
			if(maxName.length()<input[index].length()) {
				maxName=input[index];
			}
		}
		System.out.println(maxName);
	}
	public static void main(String[] args) {
		String[] name= {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		new MaxLength().maxLength(name);
	}
}
