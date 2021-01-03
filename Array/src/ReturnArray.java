import java.util.Scanner;

public class ReturnArray {
    private static  Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = getArrayValue(5);
        for (int i=0;i<arr.length;i++) {
            System.out.println("Element "+i+" entered value was "+arr[i]);
        }
        System.out.print("The average of five integers is: "+ getAverage(arr));
    }
    public static int[] getArrayValue(int numbers){
        System.out.println("Enter "+numbers+" integer values.");
        int[] values= new int[numbers];
        for (int i = 0; i<values.length; i++){
            values[i]= obj.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] values){
        int sum=0;
        for (int i=0;i<values.length;i++){
            sum+=values[i];
        }
        return (double) sum/(double) values.length;
    }
}
