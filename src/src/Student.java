package src;
//Assignment4
//WAP to show student result.

public class Student {
	double stdmarks;
	String stdName;
	String grade;
	
	void studentName(String name) {
	   stdName=name;
	}
	
    void gainedMark(double mark) {
    	if(mark>100 || mark<0) {
    		System.out.println("Invalid input");
    	}else if(mark>90 && mark<100) {
    		grade="A+";
    	}else if(mark>=80 && mark<90) {
    		grade="A";
    	}else if(mark>=70 && mark<80) {
    		grade="B+";
    	}else if(mark>=60 && mark<70) {
    		grade="B";
    	}else if(mark<60) {
    		grade="C";
    	}
    }
    void display() {
    	System.out.println(stdName+" received grade "+grade );
    }
    public static void main(String[] args) {
    	Student student=new Student();
    	student.studentName("Minal");
    	student.gainedMark(75);
    	student.display();
    }
    
}
