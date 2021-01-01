public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigit(12576));
    }
    public static int sumDigit(int number) {
        int sum=0;
        if(number>=10) {
            while (number > 0) {    //for (sum = 0; n > 0; sum = sum n % 10,n = n/10);
                //int remainder = number % 10;
                sum += number%10;
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
}


