import java.util.LinkedList;

public class Practics {
    public static void main(String[] args) {
        LinkedList<Integer> value = new LinkedList<>();
        value.add(10);
        value.add(20);
        value.add(30);
        value.add(40);
        System.out.println(value);
        System.out.println(value.contains(30));
        value.toArray();
    }
}
