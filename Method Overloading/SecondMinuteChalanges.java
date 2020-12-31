public class SecondMinuteChalanges {
    public static void main(String[] args) {
        System.out.println(getDurationString(125,55));
        System.out.println(getDurationString(7555));
    }
    public static String getDurationString(int minutes,int seconds) {
        if(minutes>=0 && seconds<=60) {
            int totalHour= minutes/60;
            int remainMinutes=minutes%60;
            return totalHour+ "h "+remainMinutes+ "m "+seconds+"s ";
        }
            return "Invalid Value";
    }
    public static String getDurationString(int second) {
        if(second<0){
            return "Invalid second";
        }
        else {
            int minutes= second/60;
            int remainSecond=second%60;
            return getDurationString(minutes,remainSecond);
        }

    }
}
