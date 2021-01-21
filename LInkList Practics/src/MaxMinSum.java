import java.util.Arrays;

public class MaxMinSum {
    public static void main(String[] args) {
        int[] arr={30,11,65,99,4};
        int minSum=0;
        int maxSum=0;
        Arrays.sort(arr);

        for (int i=0;i<arr.length;i++){
            System.out.println("Arr["+i+"]= "+ arr[i]);
        }

        for (int i=0;i<arr.length-1;i++){
            minSum+=arr[i];
        }
        System.out.println("MinSum= "+minSum);
        for (int i=arr.length-1;i>0;i--){
            maxSum+=arr[i];
        }
        System.out.println("MaxSum= "+maxSum);
    }
}
