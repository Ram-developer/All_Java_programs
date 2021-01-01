public class GreatestCommonDivisor {
    public static void main(String[] args) {
        //System.out.println(check(26,13));
        System.out.println(getGreatestCommonDivisor(9,18));

    }
//    public static int check(int first1,int second1) {
//        if (first1<10 || second1<10){
//            return -1;
//        } else {
//            return getGreatestCommonDivisor(first1, second1);
//        }
//    }
//    public static int getGreatestCommonDivisor(int first, int second)
//    {
//        if (first == 0)
//            return second;
//        if (second == 0)
//            return first;
//        if (first == second)
//            return first;
//        if (first > second){
//            return getGreatestCommonDivisor(first-second, second);
//        } else
//            { return getGreatestCommonDivisor(first, second-first);
//            }
//    }
    public static int getGreatestCommonDivisor(int first,int second) {
        if (first<10 || second<10) {
            return -1;
        }
        int gcd = 1;
        for (int i = 1; i <= first && i <= second; ++i) {
            if (first % i == 0 && second % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
