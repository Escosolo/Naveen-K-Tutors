package OOPConceptPart1;

public class FunctionsInJava {
	//main method is the starting point of execution
	public static void main(String[] args) {
		//one object will be created, emeka is the reference variable or reference name, referring to this object
		//after creating the object, the copy of all non-static methods will be given to this object
		
		FunctionsInJava emeka = new FunctionsInJava();
		emeka.test();
		
		int e = emeka.pop();
		System.out.println(e);
		
		String s6 = emeka.qa();
		System.out.println(s6);
		
		int div = emeka.division(20,10);
		System.out.println(div);
		
		//main method is void, it never returns a value
	}
	
	
	//non static methods
	//void does not return any value
	//return type = void
	//method name = test
	public void test(){
		System.out.println("test method");
	}
	//method name = pop
	public int pop(){
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a + b;
		
		return c;
	}
		public String qa(){
			System.out.println("qa method");
			String s = "Selenium";
			
			return s;
	}
		public int division(int x, int y){
			System.out.println("division method");
			int d = x/y;
			
			return d;
		}
		}