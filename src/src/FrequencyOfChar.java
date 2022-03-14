package src;

import java.util.Scanner;

//Assignment 16

/*WAP to find the frequency of character from a given String array.
Note: Take String and character from the user.*/


public class FrequencyOfChar {

	
	void checkFrequency(String str,char targetchar) {
		int count=0;
		int length=str.length();
		str=str.toUpperCase();
		targetchar=Character.toUpperCase(targetchar);
		for(int index=0;index<str.length();index++) {
			if(str.charAt(index)==targetchar)
				count++;
			}
		System.out.println("  "+count);
		
	}
	public static void main(String[] args) {
		FrequencyOfChar frequencyofchar=new FrequencyOfChar();
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str=scanner.next();
		System.out.println("Enter the character");
		char targetchar=scanner.next().charAt(0);
		
		frequencyofchar.checkFrequency(str, targetchar);
		
	}

}
