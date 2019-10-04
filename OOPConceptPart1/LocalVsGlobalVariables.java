package OOPConceptPart1;

public class LocalVsGlobalVariables {
	//Global Variables -- Class Variables
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		int i = 10; //local variable for main method
		System.out.println(i);
		
		LocalVsGlobalVariables emeka = new LocalVsGlobalVariables();
		System.out.println(emeka.name);
		System.out.println(emeka.age);
		
	}

	
		public void sum(){
			int i = 15; //Local Variable for sum method
			int j = 20;
		
			
		}
}
