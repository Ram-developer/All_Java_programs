package Udemy.JavaCoding;

public class Main {

    public static void main(String[] args) {
        double x = 20.00d;
        double x1 = 80.00d;
        double x2 = (x + x1) * 100.00d;
        System.out.println(x2);
        double x3 = x2 % 40;
        
        System.out.println("Reminder: " + x3);
        boolean isNoRemainder = (x3 == 0) ? true : false;
        System.out.println("isNoRemainder= " + isNoRemainder);
        if (!isNoRemainder) System.out.println("There is a remainder");
    }
}
