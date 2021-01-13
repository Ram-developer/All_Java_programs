import java.util.Scanner;

public class Minimum_Element {
    private static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter array range ");
        int count= obj.nextInt();
        obj.nextLine();
        int[] returnedArray=readIntegers(count);
        int returnFindMinimumValue=findMin(returnedArray);
        System.out.print("The minimum value is: "+returnFindMinimumValue);
    }
    private static int[] readIntegers(int count){
        int[] array = new int[count];
        for (int i=0;i<array.length;i++){
            System.out.print("Array["+i+"]= ");
            int number=obj.nextInt();
            obj.nextLine();
            array[i]=number;
        }
        return array;
    }
    private static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){
            int value=array[i];
            if (value<min){
                min=value;
            }
        }
        return min;
    }
}
