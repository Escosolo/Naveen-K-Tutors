package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		 
		MethodOverloading emeka = new MethodOverloading();
		
		emeka.sum();
		emeka.sum(10);
		emeka.sum(10, 5);
	}
public static void main(int p) {
	}
public static void main(int q, int e) {
	
}
//we can overload main method also
//you can not create a method inside a method
//duplicate methods -- i.e. same method name with same number of arguments are not allowed and same datatype are not allowed

//same method name with same number of arguments and different datatypes are allowed

//method overloading --> when the method name is the same with different arguments or input parameters within the same class
public void sum() { //0 input parameters
	System.out.println("SUM method -- zero parameters");
}

public void sum(int i) { //1 input parameters
	System.out.println("SUM method -- 1 input parameters");
	System.out.println(i);
}
public void sum(int k, int l) { //2 input parameters
	System.out.println("SUM method -- 1 input parameters");
	System.out.println(k+l);
}
public void sum(double d) { //1 input parameters
	System.out.println("SUM method -- 1 input parameters");
}
}