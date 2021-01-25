public class RepearShop {
    public static void repairCar(Car car){
        System.out.println("Car is repaired.");
    }
    public static void main(String[] args) {
        WagonR obj=new WagonR();
        Audi obj2=new Audi();
        repairCar(obj);
        repairCar(obj2);
    }
}
