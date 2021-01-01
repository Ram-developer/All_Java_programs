import java.util.Scanner;

public class AgeCalculate {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        boolean year = obj.hasNextInt();
        if (year) {
            int yearOfBirth = obj.nextInt();
            System.out.print("Enter your name: ");
            String name = obj.nextLine();
            int ageCalculate = 2020 - yearOfBirth;
            if (ageCalculate >=0 && ageCalculate<=100) {
                System.out.println(name + " Your age is " + ageCalculate);
            } else {
                System.out.println("Invalid year of birth");
            }

        }
        else {
            System.out.println("Please type a numeric number.");
        }
        obj.close();
    }
}
