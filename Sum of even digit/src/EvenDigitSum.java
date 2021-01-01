public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(89256));
    }
    public static int getEvenDigitSum(int number) {
        int sumOfEven=0;
        int lastDigit=0;
        int sumOfEvenDigit=0;
        if (number<0) {
            return -1;
        }
        else {
            while (number!=0) {
                lastDigit=number%10;
                if (lastDigit%2==0) {
                    sumOfEvenDigit=sumOfEvenDigit+lastDigit;
                }
                number=number/10;
            }
                return sumOfEvenDigit;
        }
    }
}
