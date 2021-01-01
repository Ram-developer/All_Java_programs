public class Pattern1 {
    public static void main(String[] args) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number) {
        if (number<5){
            System.out.println("Invalid Value");
        }
        else {
            int i,j;
            for (i = 0; i < number; i++) {
                for (j = 0; j < number; j++) {
                    if (i == 0 || j == 0 || i == j || i == number - 1 || j == number - 1 || i + j == number - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
