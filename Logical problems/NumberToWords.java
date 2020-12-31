public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(0);
        System.out.println(reverse(12365));
        System.out.println(getDigitCount(123));
    }
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            int reverseNumber=reverse(number);
            while (reverseNumber != 0) {
                int remainder = reverseNumber % 10;
                reverseNumber = reverseNumber / 10;
                switch (remainder) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.print("One ");
                        break;
                    case 2:
                        System.out.print("Two ");
                        break;
                    case 3:
                        System.out.print("Three ");
                        break;
                    case 4:
                        System.out.print("Four ");
                        break;
                    case 5:
                        System.out.print("Five ");
                        break;
                    case 6:
                        System.out.print("Six ");
                        break;
                    case 7:
                        System.out.print("Seven ");
                        break;
                    case 8:
                        System.out.print("Eight ");
                        break;
                    case 9:
                        System.out.print("Nine ");
                        break;
                    default:
                        System.out.println("Error ");
                }
            }
        }
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        return reversed;
    }
    public static int getDigitCount(int number){
        if (number<0){
            return -1;
        }else {
        String x =Integer.toString(number);
        return x.length();
        }
    }
}
