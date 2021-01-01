public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(SumOfNumbers(5,10));
        System.out.println(SumOfNumbers(5,10,15));
        System.out.println(SumOfNumbers(5,10,15,20));
    }
    public static int SumOfNumbers(int a,int b) {
        return a+b;
    }
    public static int SumOfNumbers(int a,int b,int c) {
        return a+b+c;
    }
    public static int SumOfNumbers(int a,int b,int c,int d) {
        return a+b+c+d;
    }
}
