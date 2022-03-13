package src;

//Assignment 12
/*Design to test static, non static, return type concepts.

1) Method sum() - non static method, accept 3 parameters of type double & return answer

2) Method average()- non static method, accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) and return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.
*/

public class Candidate {
	
	
	double sum(double a,double b,double c) {
		double z=a+b+c;
		return z; 
	}
	
	double avg(double sumAnswer) {
		double z1=sumAnswer/3;
		return z1;
	}
	
	boolean isAnswerAboveExpection(double avgAnswer) {
		if(avgAnswer>50) {
			return true;
		}else
			return false;
		}
	
	static boolean isEligible(double avgAnswer) {
		if(avgAnswer>50 || avgAnswer/2==0) {
			System.out.println("Candidate is eligible");
			}
		return true;
		
	}
	static String getYourGrade(double avgAnswer) {
		if(avgAnswer>80) {
			System.out.println("Candidate obtained A grade");
			return "A grade" ;
		}else
			System.out.println("Candidate obtained B grade");
			return "B grade";
	}
	public static void main(String[] args) {
		Candidate candidate1=new Candidate();
		
		double sumAnswer=candidate1.sum(65, 87, 59);
		double avgAnswer=candidate1.avg(sumAnswer);
		candidate1.isAnswerAboveExpection(avgAnswer);
		candidate1.isEligible(avgAnswer);
		candidate1.getYourGrade(avgAnswer);
		
	}
}
