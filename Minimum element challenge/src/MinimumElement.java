import java.util.Scanner;

public class MinimumElement {
    private static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {
        int n=readInteger();
        int[] returnReadElement=readElements(n);
        int findMinElement=findMin(returnReadElement);
        System.out.print("Min element is: "+findMinElement);
    }
    private static int readInteger(){
        int n=obj.nextInt();
        obj.nextLine();
        return n;
    }
    private static int[] readElements(int number){
        int[] arr=new int[number];
        for (int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
            obj.nextLine();
        }
        return arr;
    }
    private static int findMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            int value=arr[i];
            if (value<min){
                min=value;
            }
        }
        return min;
    }
}
