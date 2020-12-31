public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,22));
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
        if(hourOfDay<0 || hourOfDay>23 || !barking) {
            return false;
        }
        return hourOfDay < 8 || hourOfDay > 22;

    }
}
