public class Audi extends Car {
    public void accelerator(){
        System.out.println("Audi is accelerating......");
    }

    @Override
    public void accelerate() {
        System.out.println("Audi is accelerate.");
    }

    public void breaking(){
        System.out.println("Audi is breaking......");
    }
}
