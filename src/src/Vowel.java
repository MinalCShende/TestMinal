package src;

//Assigment 13
/*WAP to evaluate whether given character is vowel or not using switch case.*/

public class Vowel {
	
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
		Vowel vowel=new Vowel();
		vowel.isVowel('H');
		vowel.isVowel('e');
	}

}
