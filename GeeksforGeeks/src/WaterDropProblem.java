public class WaterDropProblem {
    public static void main(String[] args) {
        int[] arr= new int[]{3,1,2,0,4};

        System.out.println(trappingWater(arr,5));
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
