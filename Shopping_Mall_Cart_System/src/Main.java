
import java.util.Scanner;
public class Main
{
    private static final Scanner scanner = new Scanner(System.in);
    private static final Cart_System cart_system = new Cart_System();
    public static void main(String[] args)
    {
        System.out.println("\nRamprasad shopping mall cart application.");
        System.out.println("__________________________________________");
        boolean exit = false;
        int choose;
        printMenu();
        while (!exit) {
            System.out.print("Please choose any option to continue(0-6): ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt)
            {
                choose = scanner.nextInt();
                scanner.nextLine();

                switch (choose)
                {
                    case 0:
                        printMenu();
                        break;
                    case 1:
                        cart_system.printAllThings();
                        break;
                    case 2:
                        addNewThing();
                        break;
                    case 3:
                        replaceThing();
                        break;
                    case 4:
                        removeThings();
                        break;
                    case 5:
                        searchThing();
                        break;
                    case 6:
                        exit = true;
                        break;

                    default:
                        System.out.println("Please press the correct option.");
                        System.out.println("__________________________________________");
                        break;
                }
            }
            else
                {
                System.out.println(">> "+"Please enter a valid input (0 to 6).");
                System.out.println("__________________________________________");
                scanner.nextLine();
            }

        }
    }

    public static void printMenu()
    {
        System.out.println("Please choose one of these................");
        System.out.println("Press (0) To Show application list.");
        System.out.println("Press (1) To show the all cart item.");
        System.out.println("Press (2) TO add a new item to your cart.");
        System.out.println("Press (3) To replace item in the cart.");
        System.out.println("Press (4) To remove a item from the cart.");
        System.out.println("Press (5) To search a item in the cart.");
        System.out.println("Press (6) To Exit exit the application.");
        System.out.println("__________________________________________");
    }
    public static void addNewThing()
    {
        System.out.print("Please enter your shopping item: ");
        String add = scanner.nextLine();
        System.out.print("Enter the price: ");
        boolean isValid = scanner.hasNextInt();

            if (isValid){
                double price = scanner.nextDouble();
                cart_system.addThing(add.toUpperCase(),price);
                System.out.println("__________________________________________");
            }
            else
            {
                System.out.println("Please enter a valid price.");
                System.out.println("__________________________________________");
            }
            scanner.nextLine();

        }

    public static void replaceThing()
    {
        System.out.print("Choose current item name: ");
        String currentThing = scanner.nextLine();
        System.out.print("Enter new item name: ");
        String newThing = scanner.nextLine();
        System.out.print("Enter the price of new item: ");
        double price = scanner.nextDouble();
        cart_system.replaceThings(currentThing.toUpperCase(),newThing.toUpperCase(),price);
        System.out.println("__________________________________________");
    }

    public static void removeThings()
    {
        System.out.print("Choose remove item: ");
        String removeThing = scanner.nextLine();
        cart_system.removeThing(removeThing.toUpperCase());
        System.out.println("__________________________________________");
    }

    public static void searchThing()
    {
        System.out.print("Choose your item that are you search: ");
        String searchThing = scanner.nextLine();
        if (cart_system.searchThing(searchThing.toUpperCase()))
        {
            //System.out.print(">> "+searchThing+" has found.");
            cart_system.priceOfThing(searchThing.toUpperCase());
        }
        else
        {
            System.out.println(">> "+searchThing+" has not found.");
        }
        System.out.println("__________________________________________");
    }
}

// Programming by Ramprasad Mandal.