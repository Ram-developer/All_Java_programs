public class Fish extends Animal{
    private int grills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int width, int grills, int eyes, int fins) {
        super(name, 1, 1, size, width);
        this.grills = grills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }
    public void moveMusles(){
        System.out.println("Fiah.moveMusles() is called.");
    }
    public void moveBackFin(){
        System.out.println("Fish.moveBackFin() is called.");
    }
    public void swim(int speed){
        System.out.println("Fish.swim() is called.");
        moveMusles();
        moveBackFin();
        super.moves(speed);
    }
}
