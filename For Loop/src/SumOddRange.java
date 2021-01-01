public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(isOdd(3));
        System.out.println(isOdd(26));
        System.out.println(sumOdd(-4,6));

    }
    public static boolean isOdd(int number) {
        if (number>0) {
            return number%2!=0;
        }
        return false;
    }
    public static int sumOdd(int start,int end) {
        int sumOfOddNumber = 0;
        if (start <= end && start>0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sumOfOddNumber += i;
                }

            }
            return sumOfOddNumber;
        }
        return -1;
    }
}
