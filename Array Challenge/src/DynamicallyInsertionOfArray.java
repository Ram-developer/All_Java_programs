import java.util.Scanner;

public class DynamicallyInsertionOfArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial array range: ");
        int range = scanner.nextInt();
        System.out.println("Insert element in the array.........");
        int[] arr = new int[range];
        for (int i=0;i<arr.length;i++){
            System.out.print("Array["+i+"]= ");
            arr[i]=scanner.nextInt();
        }

        System.out.println("Insert new element of the array............");
        System.out.print("Enter new element: ");
        int newElement = scanner.nextInt();
        System.out.print("Enter the position: ");
        int position = scanner.nextInt();

        if (position<0 || position>arr.length-1){
            System.out.println("Error>> Index out of bound.");
        } else {
            int[] arr1 = new int[arr.length+1];
            for (int i=0;i< arr1.length;i++){
                arr1[i]=arr[i];
            }
            for (int i= arr.length;i<0;i--){


            }
        }
    }
}
