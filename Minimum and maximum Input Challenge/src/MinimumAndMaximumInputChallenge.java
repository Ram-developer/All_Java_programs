import java.util.Scanner;
public class MinimumAndMaximumInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;   //Integer.MIN_VALUE
        int max = 0;  //Integer.MAX_VALUE
        System.out.println("min= "+ min + ", max= " + max);
        while(true) {
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                if(number > max) {
                    max = number;
                }
                if(min==0 ||number < min) {
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input
        }
        System.out.println("min= "+ min + ", max= " + max);
        scanner.close();
    }
}
