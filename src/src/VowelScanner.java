package src;

//Assignment 14
/*WAP to evaluate whether given character is vowel or not using scanner class*/

import java.util.Scanner;

public class VowelScanner {
	void isVowel(char ch) {
		switch(ch) { 
		case 'A' :
		case 'a' :
			System.out.println(ch+" is a vowel");
			break;
		case 'E' :
		case 'e' :
			System.out.println(ch+" is a vowel");
			break;
		case 'I' :
		case 'i' :
			System.out.println(ch+" is a vowel");
			break;
		case 'O' :
		case 'o' :
			System.out.println(ch+" is a vowel");
			break;
		case 'U' :
		case 'u' :
			System.out.println(ch+" is a vowel");
			break;
		default :
			System.out.println(ch+" is not a vowel");
		}
		
	}
	public static void main(String[] args) {
		VowelScanner vowelsc=new VowelScanner();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter alphabet");
		String input=scanner.next();
		char ch=input.charAt(0);
		vowelsc.isVowel(ch);
	}

}
