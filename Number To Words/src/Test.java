public class NumberToWords{
    public static void main(String[] args) {

    }
    public static void numberToWords(int number){
        if (number<0){
            System.out.println("Invalid Value");
        }
        int digit,count=0;
        int num=reverse(number);
        while (num!=0){
            digit=num%10;
            switch (digit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            num/=10;
            count++;
        }
        for (;count<getDigitCount(number);count++){
            System.out.println("Zero");
        }

    }

    public static int getDigitCount(int number){
        int count=0;
        if (number <0){
            return -1;
        }
        if (number==0){
            return 1;
        }
        while (number>0){
            number/=10;
            count++;
        }
        return count;
    }
    public static int reverse(int number){
        int reverse=0;
        while (number!=0){
            reverse+=number%10;
            number/=10;
            if (number==0){
                return reverse;
            }
            reverse*=10;
        }
        return reverse;
    }


}