public class ParseStringIntoInteger {
    public static void main(String[] args) {
        String values = "143";
        System.out.println("This is String Value= " + values);
        int numbers = Integer.parseInt(values);
        System.out.println("This is Integer value= " + numbers);
        values += 1;
        numbers += 1;
        System.out.println("Updated String Values= " + values);
        System.out.println("Updated number values= " + numbers);
    }
}

