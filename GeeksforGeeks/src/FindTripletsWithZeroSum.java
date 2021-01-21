
// This problem time complexity is: O(n^3)
public class FindTripletsWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {-1,5,-8,5,6,-4};
        System.out.println(calculate(arr));

    }
    public static boolean calculate(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==0){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

