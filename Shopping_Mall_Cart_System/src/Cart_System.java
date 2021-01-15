import java.util.ArrayList;

public class Cart_System
{
    private final ArrayList<String> shoppingList = new ArrayList<>();
    private final ArrayList<Double> shoppingPrice = new ArrayList<>();

    public void addThing(String thing,double rate){

        if (searchThing(thing))
        {
            System.out.println(">> "+"You have already cart "+ thing);
        }
        else {
            shoppingList.add(thing);
        }
        shoppingPrice.add(rate);
    }

    public void printAllThings()
    {
        double sum=0;
        System.out.println(">> "+"You have cart "+shoppingList.size()+" items.");
        for (int i=0;i<shoppingList.size();i++)
        {
            System.out.println("\t"+(i+1)+". " + shoppingList.get(i)+"\t Price: "+shoppingPrice.get(i));
        }
        for (int j=0;j<shoppingList.size();j++){
            sum=sum+shoppingPrice.get(j);
        }
        if (sum>0){
            System.out.println("__________________________________________");
            System.out.println("\t~Total price: "+sum);
        }
        System.out.println("__________________________________________");
    }

    public void replaceThings(String currentThing, String newThing,double rate)
    {
        int position = findThing(currentThing);
        if (searchThing(currentThing))
        {
            if (position>=0 && !searchThing(newThing))
            {
                replaceThings(position,newThing,rate);
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

    private void replaceThings(int index, String thing,double newPrice)
    {
        shoppingList.set(index, thing);
        shoppingPrice.set(index,newPrice);
        System.out.println(">> "+"Your cart item "+(index+1)+" has been replace.");
    }

//    public void testThing(String thing){
//        int position = findThing(thing);
//        System.out.println("Test index:  " + position);
//    }
    public void removeThing(String thing)
    {
        int position= findThing(thing);
        System.out.println("Index :   "+position);
        if (searchThing(thing)){
            if (position>=0){
                removeThing(position);
                System.out.println(">> You remove "+thing+" on your cart.");
                removePrice(position);
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

    private void removePrice(int index){
        shoppingPrice.remove(index);
    }

    private int findThing(String searchThings)
    {
        return shoppingList.indexOf(searchThings);
    }

    public boolean searchThing(String thing)
    {
        int position= findThing(thing);
        return position >= 0;
    }
    public void priceOfThing(String thing){
        int position = findThing(thing);
        System.out.print("Search item: "+ shoppingList.get(position));
        Double price = shoppingPrice.get(position);
        System.out.println("\tPrice: "+price);

    }

}

// Programming by Ramprasad Mandal.