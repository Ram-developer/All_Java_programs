import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeProblem {
    public static void main(String[] args) {
        List<Integer> candles= new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);

        System.out.println(candles);
        int count=0;
        for (int j=0;j<candles.size();j++){
            for (int i=0;i<candles.size()-j-1;i++){
                if (candles.get(i) == candles.get(i + 1)){
                    count++;
                }
            }
        }
        System.out.println("Equal candles: "+count);

    }
}
