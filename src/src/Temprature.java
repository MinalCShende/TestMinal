//WAP to convert temprature from fahrenheit to celcius degree.

package src;

class Temprature{

  void convert(double x){
     double celcius=(x-32)*5/9;
	 System.out.println("Temprature in celcius is ="+celcius);
  }
 public static void main(String[] args){
	 Temprature temprature=new Temprature();
	 temprature.convert(156);
 }

}