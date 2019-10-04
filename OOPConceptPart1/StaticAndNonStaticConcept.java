package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	//global variables : the scope of global variables should be available across all the functions with some conditions
	//for non- static variables call them with the object name whilst with static you can call them directly or by class name
	String name = "Tom"; //static global variable
	static int age = 23; //non-static global variable
	public static void main(String[] args) {
		//how to call static methods and variables
		//1. direct calling
		sum();
		//2. calling by classname
		StaticAndNonStaticConcept.sum();
		
		//HOW TO CALL VARIABLES
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non-static functions and variables
		StaticAndNonStaticConcept emeka = new StaticAndNonStaticConcept();
		emeka.sendMail();
		System.out.println(emeka.name);
		
		// can i access static methods by using object reference?
		//Yes, but its not a good practice
		emeka.sum();
		
		//static methods and variables are not stored in the object
	}
	public void sendMail() {//non-static method
		System.out.println("send mail method");
	}
	public static void sum() {//non-static method
		System.out.println("Sum method");
}
}