import java.util.Scanner;

public class PrintAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);

        float b=sc.nextFloat();
        System.out.println(b);

        long c=sc.nextLong();
        System.out.println(c);

        byte d=sc.nextByte();
        System.out.println(d);
        sc.nextLine();
        String s=sc.nextLine();
        System.out.println(s);

    }
}
