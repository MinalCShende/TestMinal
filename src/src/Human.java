package src;

class Human{
  String name;
  boolean canSpeak;
  int age;
  
    void humanName(String personName){
    name=personName;
  }
  
    void canSpeak(boolean flag){
    canSpeak=flag;
  }
  
    void humanAge(int personAge){
    age=personAge;
  }
  
    void showDetails(){
    System.out.println("Person's name is :"+name);
	System.out.println("Person can speak :"+canSpeak);
	System.out.println("Person's age is :"+age);
  }
  
  public static void main(String[] args){
    Human human=new Human();
	human.humanName("Swati");
	human.canSpeak(false);
	human.humanAge(28);
	human.showDetails();
  }

}