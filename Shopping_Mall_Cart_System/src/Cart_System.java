import java.util.ArrayList;

public class Cart_System
{
    private ArrayList<String> shoppingList = new ArrayList<String>();

    public void addThing(String thing){

        if (searchThing(thing))
        {
            System.out.println(">> "+"You have already cart "+ thing);
        }
        else {
            shoppingList.add(thing);
        }
    }

    public void printAllThings()
    {
        System.out.println(">> "+"You have cart "+shoppingList.size()+" items.");
        for (int i=0;i<shoppingList.size();i++)
        {
            System.out.println("\t"+(i+1)+". " + shoppingList.get(i));
        }
        System.out.println("__________________________________________");
    }

    public void replaceThings(String currentThing, String newThing)
    {
        int position = findThing(currentThing);
        if (searchThing(currentThing))
        {
            if (position>=0 && !searchThing(newThing))
            {
                replaceThings(position,newThing);
            }
            else
                {
                System.out.println(">> "+"You have already cart "+ newThing);
            }
        }
        else
        {
            System.out.println(">> "+currentThing+ " doesn't exist on your cart.");
        }

    }

    private void replaceThings(int index, String thing)
    {
        shoppingList.set(index, thing);
        System.out.println(">> "+"Your cart item "+(index+1)+" has been replace.");
    }

    public void removeThing(String thing)
    {
        int position= findThing(thing);
        if (searchThing(thing)){
            if (position>=0){
                removeThing(position);
                System.out.println(">> You remove "+thing+" on your cart.");
            }
        }
        else
        {
            System.out.println(">> "+thing+" doesn't fount on your cart");
        }

    }

    private void removeThing(int index)
    {
        shoppingList.remove(index);
    }

    private int findThing(String searchThings)
    {
        return shoppingList.indexOf(searchThings);
    }

    public boolean searchThing(String thing)
    {
        int position= findThing(thing);
        if (position>=0)
        {
            return true;
        }
        else
            {
            return false;
        }
    }

}
