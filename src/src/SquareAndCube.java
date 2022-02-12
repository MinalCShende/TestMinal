//WAP to calculate square and cube of a number.
package src;

class SquareAndCube{

  void square(int num){
   int answer=num* num ;
   System.out.println("Square of num is = "+ answer);  
  }
  
   void cube(int num){
	int answer=num*num*num; 
	System.out.println("Square of num is = "+ answer);   
  }
  
  public static void main (String[] args){
	SquareAndCube squareAndCube=new SquareAndCube();
    squareAndCube.square(8);
    squareAndCube.cube(8);	
	  
  }
}