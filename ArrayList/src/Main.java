import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit=false;
        int choice=0;
        printInstructions();
        while (!quit){
            System.out.println("Enter your choice: ");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGrocerylist();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    scarchForItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("Press...........");
        System.out.println("0 - to print choice option.");
        System.out.println("1 - to print list of grocery items.");
        System.out.println("2 - to add an item to the list.");
        System.out.println("3 - to modify an item in the list.");
        System.out.println("4 - to remove an item from the list.");
        System.out.println("5 - to search for an item in the list.");
        System.out.println("6 - to quit the application.");
    }
    public static void addItem(){
        System.out.println("Please enter the grocery item.");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter the number.");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter replacement item.");
        String newItem=scanner.nextLine();
        groceryList.modifyGroceryItems(itemNo,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter the number.");
        int number= scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGrocecryItem(number-1);
    }
    public static void scarchForItem(){
        System.out.println("Search item for.");
        String searchItem= scanner.nextLine();
        if (groceryList.findItem(searchItem)!=null){
            System.out.println("Found search item "+searchItem+" in your grocery list.");
        }
        else {
            System.out.println("Search item "+searchItem+" not found in your grocery list");
        }
    }
}
