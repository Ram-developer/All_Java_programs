import java.util.Random;
import java.util.Scanner;
public class SnakeGunWater {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Press 1 to choose 'SNAKE'");
        System.out.println("Press 2 to choose 'GUN'");
        System.out.println("Press 3 to choose 'WATER'");
        System.out.print("You choose: ");
        int n= obj.nextInt();
        int low=1,high=4;
        Random randomObj= new Random();
        int randomGenetare= low+randomObj.nextInt(high-low);
        switch (n) {
            case 1:
                System.out.println("You: Choose SNAKE.");
                if (randomGenetare==1){
                    System.out.println("Computer: Choose SNAKE.");
                    System.out.println("The Game is draw, please play one more time.");
                }
                else if(randomGenetare==2){
                    System.out.println("Computer: Choose GUN.");
                    System.out.println("Result: Loss the game.");
                }
                else {
                    System.out.println("Computer choose WATER......");
                    System.out.println("Result: You win the game");
                }
                break;
            case 2:
                System.out.println("You: Choose GUN.");
                if (randomGenetare==2){
                    System.out.println("Computer: Choose GUN.");
                    System.out.println("The Game is draw, please play one more time.");
                }
                else if(randomGenetare==1){
                    System.out.println("Computer: Choose SNAKE.");
                    System.out.println("Result: You win the game.");
                }
                else {
                    System.out.println("Computer: Choose WATER.");
                    System.out.println("Result: You Loss the game");
                }
                break;
            case 3:
                System.out.println("You: Choose WATER.");
                if (randomGenetare==3){
                    System.out.println("Computer: Choose WATER.");
                    System.out.println("The Game is draw, please play one more time.");
                }
                else if(randomGenetare==1){
                    System.out.println("Computer: Choose SNAKE.");
                    System.out.println("Result: You Loss the game.");
                }
                else {
                    System.out.println("Computer: Choose GUN.");
                    System.out.println("Result: You win the game");
                }
                break;
            default:
                System.out.println("To continue the game please press 1,2 or 3.");
        }
    }
}
