//This problem's time complexity is: O(n logn)

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindTripletWithZeroSumInOnlogn {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the range of array element: ");
        int range= obj.nextInt();
        System.out.println("Enter the array element..........");
        int[] arr = new int[range];
        for (int i=0;i<arr.length;i++){
            System.out.print("Array["+i+"]= ");
            arr[i]=obj.nextInt();
        }
        System.out.println("Output: "+triplet(arr));
    }
    public static boolean triplet(int[] arr){
        Arrays.sort(arr);
        for (int i=0;i<arr.length-3;i++){
            if (twoSum(arr,-arr[i],i+1)){
                return true;
            }
        }
        return  false;
    }
    public static boolean twoSum(int[] arr, int n, int i){
        int j= arr.length-1;
        while (i<j){
            if (arr[i]+arr[j]>n) {
                j--;
            } else if (arr[i]+arr[j]<n){
                i++;
            } else return true;
        }
        return false;
    }
}
