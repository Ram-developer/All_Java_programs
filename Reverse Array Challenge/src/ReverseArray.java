import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
    }
    private static void reverse(int[] array){
        int maxIndex=array.length-1;
        int halfIndex=array.length/2;
        System.out.println("Array = "+ Arrays.toString(array));
        for (int i=0;i<halfIndex;i++){
            int temp=array[i];
            array[i]=array[maxIndex-i];
            array[maxIndex-i]=temp;
        }
        System.out.println("Reversed array = "+Arrays.toString(array));

    }
}
