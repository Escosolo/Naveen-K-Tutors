package JavaBasics;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num = 29;
        boolean b = true;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                b = false;
                break;
            }
        }
     // Check value true or false,if b is true then numberToCheckber is prime otherwise not prime
        if (b)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}