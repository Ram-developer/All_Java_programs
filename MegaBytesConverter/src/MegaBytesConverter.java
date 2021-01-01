public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(3000);
    }
        public static void printMegaBytesAndKiloBytes ( int kiloBytes){
            if (kiloBytes < 0) {
                System.out.println("Invalid Value");
            } else {
                int megaByte = kiloBytes / 1024;
                int remainderKilobute = kiloBytes % 1024;
                System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainderKilobute + " KB");
            }
        }
}
