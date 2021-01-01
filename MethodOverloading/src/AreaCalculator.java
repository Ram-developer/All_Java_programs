public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(2));
        System.out.println(area(-1.0,5.0));
    }
    public static double area(double rarius) {
        if(rarius<0) {
            return -1.0;
        }
        else {
            return Math.PI * rarius * rarius;
        }
    }
    public static double area (double x,double y) {
        if (x<0 || y<0) {
            return -1.0;
        }
        return x * y;

    }
}

