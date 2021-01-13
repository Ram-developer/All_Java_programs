import java.util.ArrayList;

public class GroceryList {
    //private int[] numbers;
    private ArrayList<String> groceryList= new ArrayList<String>();
    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGrocerylist(){
        System.out.println("You have "+groceryList.size()+" items on your groceryList.");
        for(int i=0;i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }
    public void modifyGroceryItems(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery items "+(position+1)+" has been modified");
    }
    public void removeGrocecryItem(int position){
        String theItem= groceryList.get(position);
        groceryList.remove(theItem);
    }
    public String findItem(String searchItem){
        boolean exist = groceryList.contains(searchItem);
        int position=groceryList.indexOf(searchItem);
        if (position>=0){
            return groceryList.get(position);
        }
        return null;
    }
}
