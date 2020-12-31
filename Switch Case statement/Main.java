package Udemy.JavaCoding;

import com.sun.jdi.Value;

public class Main {

    public static void main(String[] args) {
	String stringValue= "JaNUARyok";
	//char charValue= 'D';
	switch (stringValue.toLowerCase()) {
        case "january":
            System.out.println("Found JANUARY");
            break;
        case "februrary":
            System.out.println("Found FEBRUARY");
            break;
        case "march":
            System.out.println("Found MARCH");
            break;
        case "april": case "may": case "jun": case "jul":
            System.out.println("Found "+stringValue.toUpperCase());
            break;
        default:
            System.out.println("Not Found "+ stringValue.toUpperCase());

    }
    }
}
