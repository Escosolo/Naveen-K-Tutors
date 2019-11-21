package JavaBasics;

public class FinalKeyword {

	public static void main(String[] args) {
		//The test will fail because a final variable once assigned cannot be changed

		final int i;
		i=5;
		i=6;
		
		B obj = new B();
		obj.show();
	}

}
class A
{
	//test will fail cos a final method once declared as final cannot be overridden
	final public void show()
	{
		System.out.println("Emeka");
		
	}	
}

class B extends A{
	public void show() {
	System.out.println("Amaka");
	}
}

//Test will fail cos a final class, once declared as final,it cannot be inherited or extended
final class C
{

}
class D extends C
{
	
}

