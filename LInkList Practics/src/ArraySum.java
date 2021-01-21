import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter array range:");
        int n= obj.nextInt();
        int[] arr = new int[n];
        int sum=0;
        System.out.println("Intput array element: ");
        for (int i=0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        System.out.println("Sum of array");
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
