import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int[] arr;
        arr=new int[10];
        for (int i=0;i<5;i++){
            System.out.print("Array["+i+"]= ");
            arr[i]=obj.nextInt();
        }
        printArray(arr);
    }
    public static void printArray(int[] arrIn){
        System.out.println("_______________________");
        for (int i=0;i<5;i++){
            System.out.println("Array["+i+"]= "+arrIn[i]);
        }
    }
}
