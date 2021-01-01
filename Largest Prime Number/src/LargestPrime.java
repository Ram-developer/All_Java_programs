public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(0));
    }

    static int getLargestPrime( int number){
        if (number==0 || number<0){
            return -1;
        }
        int maxPrime = -1;
        while (number % 2 == 0) {
            maxPrime = 2;
            number >>= 1;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2){
            while (number % i == 0){
                maxPrime = i;
                number = number / i;
            }
        }
        if (number > 2)
            maxPrime = number;
        return maxPrime;
    }


}