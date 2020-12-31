public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour<0) {
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }
    public static void printConversion(double kilometersPersHour) {
        if (kilometersPersHour<0) {
            System.out.println("Invalid Value");
        }
        else {
            //long milesPerHour = toMilesPerHour(kilometersPersHour);
            //System.out.println(kilometersPersHour+" km/h"+milesPerHour+"mi/h");
            System.out.println(kilometersPersHour+" k/h= "+toMilesPerHour(kilometersPersHour)+" m/h");
        }
    }
}
