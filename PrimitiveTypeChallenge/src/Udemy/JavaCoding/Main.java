package Udemy.JavaCoding;

public class Main {

    public static void main(String[] args) {
	 byte byteValue=10;
	 short shortValue=20;
	 int intValue=100;
	 long longTotal=50000+10*(byteValue+shortValue+intValue);
	 System.out.println(longTotal);
	 short shortTotal=(short)(50000+10*
			 (byteValue+shortValue+intValue)); // Casting short others data type to short.
	 System.out.println(shortTotal);
    }
}
