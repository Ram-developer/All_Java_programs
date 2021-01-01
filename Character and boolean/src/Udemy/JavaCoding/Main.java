package Udemy.JavaCoding;

public class Main {

    public static void main(String[] args) {
	 char x= 'D';
	 char y= '\u0052'; // Is is Unicode. For more follow the unicode table
        System.out.println(x);
        System.out.println(y);
        String abc= "My name is Ramprasad Mandal";
        System.out.println(abc);
        String abcd= "This is my name: " + abc ;
        System.out.println(abcd);
        System.out.println("_____________________");
        boolean xx=true;
        if (xx==true) { //Equal to operator
            //if(xx!=false)
            System.out.println("Programme is running........");
        }

    }
}
