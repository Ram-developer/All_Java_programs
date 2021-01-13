import java.util.Scanner;

public class GetPrintAndSortArray {
    private static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
    int[] intStore = getValues(5);
    printValues(intStore);
    //sortArray(intStore);
        System.out.println("___________________________");
    printValues(sortArray(intStore));
    }
    public static int[] getValues(int number){
        System.out.println("Enter the integer value.");
        int[] values=new int[number];
        for (int i=0;i<values.length;i++){
            values[i]=obj.nextInt();
        }
        return values;
    }
    public static void printValues(int[] values){
        for (int i=0;i<values.length;i++){
            System.out.println("Array["+i+"] store: "+values[i]);
        }
    }
    public static int[] sortArray(int[] values){
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
            if (count==0){
                break;
            }
        }
        return values;
    }
}
