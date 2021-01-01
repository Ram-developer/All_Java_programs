
public class MethdOverloading {
    public static void main(String[] args) {
        double centimeters=calcFeetAndInchesToCentimeters(0,1);
        if(centimeters<0.0) {
            System.out.println("Invalid Parameters");

        }
        calcFeetAndInchesToCentimeters(157);
    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
        System.out.println("Invalis feet or Inches...........");
        if(!(feet>=0 || (inches>=0 && inches<=12))) {
            return -1;
        }
        double centiMerets= (feet*12)*2.54;
        centiMerets=centiMerets+inches*2.54;
        System.out.println(feet+" feet "+inches+" inches "+centiMerets+" centimeters");
        return centiMerets;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches<0){
            return -1;
        }
        double feet= (int)inches/12;
        double remainInches=(int)inches%12;
        System.out.println(inches+" inches equal to "+feet+" feet and "+remainInches+" centimeters");
        return calcFeetAndInchesToCentimeters(feet,inches);
    }

}
