public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(19,99));
    }
    public static boolean hasSharedDigit(int num1,int num2) {
        if ((num1<10 || num1>99) || (num2<10 || num2>99)) {
            return false;
        }
        else {
            int remainder1=num1%10;
            int remainder2=num2%10;
            int ans1=num1/10;
            int ans2=num2/10;
            if (remainder1==remainder2||ans1==ans2||ans1==remainder2||ans2==remainder1) {
                return true;
            }
          return false;
            }
        }
    }

