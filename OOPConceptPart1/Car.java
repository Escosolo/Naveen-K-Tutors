package OOPConceptPart1;

public class Car {
	//Class variables
	int mod;
	int wheel;
	public static void main(String[] args) {
		//new Car(); -- this is the object of Car class
		//new keyword is used to create the object class
		//a,b,c ----> Object reference variables/name
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel =3;
		
		c.mod = 2009;
		c.wheel = 6;
		
		System.out.println("before assigning the references");
		System.out.println(a.mod);
		System.out.println(a.wheel);
		System.out.println(b.mod);
		System.out.println(b.wheel);
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("after assigning the references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod =10;
		System.out.println(a.mod);
		c.mod = 20;
		System.out.println(a.mod);
		System.out.println(c.mod);
}
}