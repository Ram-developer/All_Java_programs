public class PosotiveNegitiveOrZero {
    public static void main(String[] args) {
        int n=0;
        check(n);
    }
    public static void check(int n) {
        if(n>0)
            System.out.println("Positive number");
        else if (n<0)
            System.out.println("Negitive number");
        else
            System.out.println("Zero");
    }
}
