public class Main {
    public static void main(String[] args) {
    Animal animal=new Animal("Animal",1,1,15,5);
    Dog dog=new Dog("Dog",10,3,2,3,1,25,"Red");
    Fish fish=new Fish("Fish",29,18,5,2,8);
        dog.eat();
        dog.walk();
        dog.run();
        dog.moves(20);
        fish.swim(20);
    }
}

