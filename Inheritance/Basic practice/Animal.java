public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int width;
    public Animal(String name,int brain,int body,int size, int width) {
        this.name=name;
        this.brain=brain;
        this.body=body;
        this.size=size;
        this.width=width;
    }
    public void eat() {
        System.out.println("Animal.eat() called.");
    }
    public void moves(int speed) {
        System.out.println("Animal.moves() called. Animal is moving at "+speed);
    }
    public String getName() {
        return name;
    }
    public int getBrain(){
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }
}
