package src;

class ITProfessional{
   String name;
   boolean party;
   boolean tea;
   boolean coffee;
   boolean alcohol;
   
   void empName(String personName){
     name=personName;
   }
   void doesPartyOnWeekend(boolean flag){
     party=flag;
   }
   void isAddictedToTea(boolean flag){
     tea=flag;
   }
   void isAddictedToCoffee(boolean flag){
     coffee=flag;
   }
   void isAddictedToAlcohol(boolean flag){
     alcohol=flag;
   }
   void displayInfo(){
   System.out.println("Person name :"+name);
   System.out.println("Person does party on weekend :"+party);
   System.out.println("Person is addicted to tea :"+tea);
   System.out.println("Person is addicted to coffee :"+coffee);
   System.out.println("Person is addicted to alcohol :"+alcohol);
   
   }
   public static void main(String[] args){
    ITProfessional iTProfessional=new ITProfessional();
	iTProfessional.empName("Ravi Shinde");
	iTProfessional.doesPartyOnWeekend(true);
	iTProfessional.isAddictedToTea(true);
	iTProfessional.isAddictedToCoffee(false);
	iTProfessional.isAddictedToAlcohol(false);
	iTProfessional.displayInfo();
	
   }

}