public class PlayingCat {
    public static void main(String[] args) {
       // isCatPlaying(true, 45);
        System.out.println(isCatPlaying(true,45));
    }

    public static boolean isCatPlaying(boolean summer, int temparature) {
        if (summer == true)
            return temparature >= 25 && temparature <= 45;

        else if(summer == false)
            return temparature >= 25 && temparature <= 35;
        else
            return false;
    }
}