public class AdvanceSecondMinutesChallenges {
    public static final String errorMessege="Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(125,65));
        System.out.println(getDurationString(7555));
    }
    public static String getDurationString(int minutes,int seconds) {
        if(minutes>=0 && seconds<=60) {
            int totalHour= minutes/60;
            String hourString= totalHour + "h";
            if (totalHour<10){
                hourString ="0"+totalHour;
            }
            int remainMinutes=minutes%60;
            String minuteString=remainMinutes+ "m";
            if (remainMinutes<10) {
                minuteString="0"+remainMinutes;
            }
            String secondString=seconds+ "s";
            if (seconds<10) {
                secondString="0"+seconds+"s";
            }
            return hourString + " " +minuteString+ " " + secondString + " ";
        }
        return errorMessege;
    }
    public static String getDurationString(int second) {
        if(second<0){
            return errorMessege;
        }
        else {
            int minutes= second/60;
            int remainSecond=second%60;
            return getDurationString(minutes,remainSecond);
        }

    }
}

