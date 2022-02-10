//WAP to print all deatails of student like name, middle name, surname, birthdate, address and roll number
package src;

class StudentInfo{
      String name="Shikha" ,middleName="Amit" ,surname="Patel";
	  String birthdate="10th August 1998";
	  String address="G-809, Heaven appartment, Baner, Pune";
	  int rollNumber=34;
	  
	  void studentName(){
	    System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	  }
	  
      void studentOtherDetails(){
	    System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	  }
	  
	  public static void main(String[] args){
		StudentInfo stdInfo= new StudentInfo();
        stdInfo.studentName();
         stdInfo.studentOtherDetails();		
		  
	  }
}