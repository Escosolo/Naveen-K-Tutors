package OOPConceptPart1;

public class CallByValAndCallByReference {
	int p;
	int q;
	public static void main(String[] args) {
		
		CallByValAndCallByReference emeka = new CallByValAndCallByReference();
		int x = 10;
		int y = 20;
		emeka.testSum(x, y); //call by value or pass by value
		
		emeka.p = 50;
		emeka.q = 60;
		
		emeka.swap(emeka);
		System.out.println(emeka.p);
		System.out.println(emeka.q);
	}
	
	//call by value, passing the copy of input parameters 
	public int testSum(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public void swap(CallByValAndCallByReference t) {
		int temp;
		temp = t.p; //temp = 50
		t.p = t.q; //t.p = 60
		t.q = temp; //t.q = 50
		
}
}