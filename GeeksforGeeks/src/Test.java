import java.util.Scanner;

public class Test {
    public static void main (String[] args) {
        Scanner obj =new Scanner(System.in);
        int n= obj.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }


        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
