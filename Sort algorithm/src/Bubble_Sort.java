//This arrange to ascending order. If you want to arrange descending order then in if
//condition "<" sign will be replace into ">" sign.
// Complexity O(n^2)
import java.util.Scanner;
public class Bubble_Sort {
    private static Scanner obj = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter range of array element.");
        int n= obj.nextInt();
        Sort(n);
    }
    public static void Sort(int number){
        int[] arr= new int[number];
        for (int i=0;i<number;i++){
            System.out.print("Array["+i+"]= ");
            arr[i]=obj.nextInt();
        }
        System.out.println("-------------------------------");
        for (int i=0;i<number;i++){
            for (int j=0;j<number-i-1;j++){
                if (arr[j]>arr[j+1]){  //In descending order change '>' to '>'
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<number;i++){
            System.out.println("Array["+i+"]= "+arr[i]);
        }

    }
}
