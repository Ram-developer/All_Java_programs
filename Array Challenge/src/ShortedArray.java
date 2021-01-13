import java.util.Scanner;

public class ShortedArray {
    //private static Scanner obj=new Scanner(System.in);
    public static void main(String[] args) {
        int[] storeNumbers=getIntegers(5);
        printArray(storeNumbers);
        System.out.println("After sort....................");
        int[] storeSortedNumbers=sortIntegers(storeNumbers);
        printArray(storeSortedNumbers);

    }
    public static int[] getIntegers(int number){
        Scanner obj=new Scanner(System.in);
        int array[] =new int[number];
        for (int i=0;i<array.length;i++){
            array[i]=obj.nextInt();
        }
        return array;
    }
    public static void printArray(int[] values){
        for (int i=0;i<values.length;i++){
            System.out.println("Element "+i+" contents "+values[i]);
        }
    }
    public static int[] sortIntegers(int[] values){
        int count = 0;
        for (int i=0;i<values.length-1;i++){
            for (int j=0;j<values.length-1;j++){
                if (values[j]<values[j+1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    count++;
                }
            }
        }
        return values;
    }
}

