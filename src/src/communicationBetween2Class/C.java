package src.communicationBetween2Class;

//Assignment 11
/*Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.
*/

public class C {
	void m3() {
		System.out.println("Hii,this is m3 method");
		D d1=new D();
		d1.m4();
	}

}
