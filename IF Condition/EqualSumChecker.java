public class EqualSumChecker {
    public static void main(String[] args) {
        int a=2,b=3,c=5;
        System.out.println(hasEqualSum(a,b,c));
    }
    public static boolean hasEqualSum(int a,int b,int c) {
        return a + b == c;
    }
}
