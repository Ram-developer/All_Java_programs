public class WagonR extends Car {
    public void accelerator(){
        System.out.println("WagonR is accelerating......");
    }

    @Override
    public void accelerate() {
        System.out.println("WagonR is accelerate.");
    }

    public void breaking(){
        System.out.println("WagonR is breaking......");
    }
}
