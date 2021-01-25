public class Person implements Student, YouTuber{

    public static void main(String[] args) {
        Person obj=new Person();
        obj.study();
        obj.makeVideos();
    }
    @Override
    public void study(){
        System.out.println("Person is studying.");
    }

    @Override
    public void makeVideos() {
        System.out.println("Person is making a good video.");
    }
}
