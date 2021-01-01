import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            if (s1.length()<=10){
                int spaceCreate=15-s1.length();
                System.out.print(s1);
                for (int s=1;s<=spaceCreate;s++){
                    System.out.print(" ");
                }
            }
            if (x>-1 && x<=9){
                System.out.println("00"+x);
            }
            else if (x>9 && x<=99){
                System.out.println("0"+x);
            }
            else {
                System.out.println(x);
            }
        }
        System.out.println("================================");

    }
}