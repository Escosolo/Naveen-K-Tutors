package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		//1. while loop:
		
		int i = 1; //initialization
		while(i<=10){ //conditional
        System.out.println(i);
        i= i+1; //incremental/decremental
	}
		System.out.println("*********");
		
		
		//2. for loop:
		//j++ means j+1
		//print 1 to 10
		int num = 10;
		for(int j=1;j<=num/2;j++) { //Initialization, Conditional, Incremental
			System.out.println(j);
		}
		
		System.out.println("********");
		//print 10 to 1
		//k-- means k = k-1
		//10 9 8 7 6 5 4 3 2 1
		for(int k=10;k>=-10;k--){ //Initialization, Conditional, decremental
			System.out.println(k);
		}
	}
}
