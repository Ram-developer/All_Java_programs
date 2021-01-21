import java.util.ArrayList;
class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] artArray = new String[20];
        int[] intArray = new int[20];
        ArrayList<String> srtArrayList = new ArrayList<>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(45));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(20.20);
        ArrayList<Integer> intArrayList= new ArrayList<>();
        for (int i=0;i<=10;i++){
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i=0;i<=10;i++){
            System.out.println(i+" -> "+intArrayList.get(i).intValue());
        }
    }
}
