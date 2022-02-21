package src;
//Assignment 2
//WAP to compute simple interest.

class SI{

  void simpleInterest(double P,double T,double R){
    double simpleInterest=(P*T*R)/100;
    System.out.println("SI ="+simpleInterest);	
  }
  
  public static void main(String[] args){
    SI sI=new SI();
	sI.simpleInterest(345,4,12);
  }

}