public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name, int size, int width,int eyes,int legs,int tail,int teeth,String coat) {
        super(name, 1, 1, size, width);
        this.eyes=eyes;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }
    private void crew(){
        System.out.println("Dog.crew() called. ");
    }
    public void eat(){
        System.out.println("Dog.eat() called.");
        crew();
        super.eat();
    }
    public void walk() {
        System.out.println("Dog.walk() called.");
        moves(5);
    }
    public void run() {
        System.out.println("Dog.run() called.");
        moves(10);
    }
    public void moves(int speed) {
        System.out.println("Animal.moved() called.");
        moveLegs(speed);
        super.moves(speed);

    }
    public void moveLegs(int speed){
        System.out.println("Dos.moveLegs() called.");
    }
}