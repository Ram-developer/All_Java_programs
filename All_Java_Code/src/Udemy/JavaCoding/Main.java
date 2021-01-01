package Udemy.JavaCoding;

public class Main {

    public static void main(String[] args) {
	int myValue=28_10; // Also we can write 2810. Both are same
	int minIntvalue= Integer.MIN_VALUE;
	int maxIntValuue=Integer.MAX_VALUE;
	System.out.println("Minimum integer value is: " + minIntvalue);
	System.out.println("Maximum integer value is: " + maxIntValuue);
	int x=minIntvalue+maxIntValuue;
	System.out.println("Min + Max value is: " + x);
	System.out.println("___________________________");
	byte minBiteValue= Byte.MIN_VALUE;
	byte maxBiteValue=Byte.MAX_VALUE;
	System.out.println("Byte maximum value is: "+ minBiteValue);
	System.out.println("Biye maximum value is:"+maxBiteValue);
	System.out.println("_____________________________");
	Short minShortValue= Short.MIN_VALUE;
	Short maxShortValue=Short.MAX_VALUE;
	System.out.println("Short maximum value is: "+ minShortValue);
	System.out.println("Short maximum value is:"+maxShortValue);
		System.out.println("_____________________________");
		Long minLongValue= Long.MIN_VALUE;
		Long maxLongValue=Long.MAX_VALUE;
		System.out.println("Long maximum value is: "+ minLongValue);
		System.out.println("Long maximum value is:"+maxLongValue);
		// Type casting
		int myTotal= (maxIntValuue/2);
		byte myNewByteValue= (byte)(minBiteValue/2); //Casting int to byte
		int my= minBiteValue/2;
    }
}
