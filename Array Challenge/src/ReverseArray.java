import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter range of the array.");
        int n=obj.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.print("Array["+i+"]= ");
            arr[i]=obj.nextInt();
        }
        System.out.println("Print array value in the reverse order.");
        for (int j=arr.length-1;j>=0;j--){
            System.out.println("Array["+j+"]= "+arr[j]);
        }
    }
}
