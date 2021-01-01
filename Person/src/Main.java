
public class Main {
    public static void main(String[] args) {
      Person person= new Person();
      person.setFirstName("");
      person.setLastName("");
      person.setAge(10);
        System.out.println("Full Name= "+person.getFullName());
        System.out.println("Teen= "+person.isTeen());
        person.setFirstName("Ramprasad");
        person.setAge(18);
        System.out.println("Full Name= "+person.getFullName());
        System.out.println("Teen= "+ person.isTeen());
        person.setLastName("Mandal");
        System.out.println("Full Name= "+person.getFullName());


    }
}
