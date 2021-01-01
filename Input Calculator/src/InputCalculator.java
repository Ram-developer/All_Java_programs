import java.util.Scanner;
public class InputCalculator {
    public static void main(String[] args) {
    inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner obj=new Scanner(System.in);
        int counter=0,sum=0;
        double average=0;
        while (true) {
            int order = counter + 1;
            boolean isAnInt = obj.hasNextInt();
            if (isAnInt) {
                int number = obj.nextInt();
                counter++;
                sum += number;
                average=(double)sum/order;
            } else {
                break;
            }
            obj.nextLine();
        }
        long averagee=Math.round(average);
        System.out.println("SUM = " + sum+" AVG = "+ averagee);
        obj.close();
    }
}