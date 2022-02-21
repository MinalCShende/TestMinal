package src;
//Assignment 3
//WAP called car deatails which contains method like setcompanyName, setIsCarAutomatic, setCarSpeed, displaySpecificatio.

class Car{
   String name;
   boolean isCarAutomatic;
   double carSpeed;

   void setCompanyName(String nameOfCar ){
	name=nameOfCar;
   }
   
   void setIsCarAutomatic(boolean flag){
    isCarAutomatic=flag;
   }
   
   void setCarSpeed(double speed){
    carSpeed=speed;
   }
   void displaySpecification(){
     System.out.println("Car Name is :"+ name);
	 System.out.println("Car is automatic :"+ isCarAutomatic);
	 System.out.println("Car speed is :"+ carSpeed);
   }
   
   public static void main(String[] args){
	Car car=new Car();
    car.setCompanyName("Hyundai");
    car.setIsCarAutomatic(true);
    car.setCarSpeed(412.2);	
	car.displaySpecification();
	
   }
   
}