//WAP to find area and perimeter of a rectangle and circle.
package src;

class Ground{

  void rectangle(int length,int width){
    int aOR= length*width;
    int pOR=2*length+2*width;
    System.out.println("Area of rectangle ="+aOR);
    System.out.println("Perimeter of rectangle ="+pOR);
  }
  
  void circle(double r){
    double pi=3.1416;
	double aOC=pi*r*r;
    double pOC=2*pi*r;
	System.out.println("Area of circle ="+aOC);
    System.out.println("Perimeter of circle ="+pOC);
  }
  public static void main(String[] args){
	Ground ground=new Ground();
    ground.rectangle(10,7);
    ground.circle(2.5);	
  }
}