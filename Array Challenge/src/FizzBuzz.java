import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner obb = new Scanner(System.in);
        System.out.print("Please enter a range: ");
        int n=obb.nextInt();
        CalculationFizzBuzz(n);
    }
    public static void CalculationFizzBuzz(int n){
        for (int i=1;i<=n;i++){
            if (i%3==0 && i%5!=0){
                System.out.println("Fizz");
            }
            else if (i%5==0 && i%3!=0){
                System.out.println("Buzz");
            }
            else if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
