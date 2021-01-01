public class Main {
    public static void main(String[] args) {
    Hamburger hamburger=new Hamburger("Basic","Sauage",3.56,"White");
    double price=hamburger.itemizeHamburger();
    hamburger.addHamburgerAddition1("Tomato",0.27);
    hamburger.addHamburgerAddition2("Lettuce",0.75);
    hamburger.addHamburgerAddition3("Cheese",1.12);
//    hamburger.addHamburgerAddition4("Lettuce",0.75);
    //price=hamburger.itemizeHamburger();
        System.out.println("Total burger price is "+hamburger.itemizeHamburger());
        HealthyBurger healthyBurger=new HealthyBurger("Bacon",5.67);
        //healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerAddition1("Egg",5.43);

        healthyBurger.addHealthAddition1("Lentils",3.41);
        System.out.println("Total healthy burger price is "+healthyBurger.itemizeHamburger());



    }
}
