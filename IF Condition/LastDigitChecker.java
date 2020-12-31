public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(22,23,34));
        System.out.println(isValid(9));
    }
    public static boolean hasSameLastDigit(int a,int b,int c) {
        if (a<10 || a> 100 || b<10 || b>100 || c<10 || c>100) {
            return false;
        }
        else {
                int remainder1=a%10;
                int remainder2=b%10;
                int remainder3=c%10;
                if(remainder1==remainder2 || remainder1==remainder3 || remainder2==remainder3) {
                    return true;
                }
            return false;
        }
    }
    public static boolean isValid(int number) {
        return number>=10 && number<=1000;
    }
}
