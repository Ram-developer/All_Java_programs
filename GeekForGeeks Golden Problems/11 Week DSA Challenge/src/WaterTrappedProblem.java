import java.util.Scanner;

public class WaterTrappedProblem {
        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            System.out.print("Enter the length of the array: ");
            int n=obj.nextInt();
            int[] arr = new int[n];

            for (int i=0;i<arr.length;i++){
                System.out.print("Array["+i+"]= ");
                arr[i]=obj.nextInt();
            }
            System.out.print("Stored water: "+trappingWater(arr,n));

        }
        public static int trappingWater(int arr[], int n) {
            int result=0;
            int i=0,j=n-1;
            int maxLeft=0,maxRight=0;
            while (i<j){
                if (arr[i]<=arr[j]){
                    maxLeft=Math.max(maxLeft,arr[i]);
                    result+= maxLeft-arr[i];
                    i++;
                } else {
                    maxRight=Math.max(maxRight,arr[j]);
                    result+= maxRight-arr[j];
                    j--;
                }
            }
            return result;
        }


    }
