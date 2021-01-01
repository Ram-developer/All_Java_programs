public class Main {
    public static void main(String[] args) {
        Wall wall1=new Wall("East");
        Wall wall2=new Wall("West");
        Wall wall3=new Wall("South");
        Wall wall4=new Wall("North");
        Ceiling ceiling=new Ceiling(25,4);
        Bed bed=new Bed("Modern Bed",4,5,3,2);
        Lamp lamp=new Lamp("Classic",false,5);
        BedRoom bedRoom=new BedRoom("Ram",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
