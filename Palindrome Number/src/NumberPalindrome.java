public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome(int number) {
        int sum=0,remainder;
        int modifiedNumber= Math.abs(number);
        int temp=modifiedNumber;
        while (modifiedNumber>0) {
            remainder = modifiedNumber % 10;
            sum = (sum * 10) + remainder;
            modifiedNumber = modifiedNumber / 10;
        }
            if (temp==sum) {
                return true;
            }
            else
                return false;
        }
}
