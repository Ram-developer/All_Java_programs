public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.1750,1.1756));
    }
    public static boolean areEqualByThreeDecimalPlaces(double x,double y) {
        x = (int)(x * 1000);
        y = (int)(y * 1000);
        if (x==y) {
            return true;
        }
        return false;
    }
}
