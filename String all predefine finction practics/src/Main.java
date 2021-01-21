import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        String first=A.toLowerCase();
        String last=B.toLowerCase();
        int result = A.compareTo(B);
        System.out.println(A.length()+B.length());

        if(result>0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
        System.out.println(first.substring(0,1).toUpperCase().concat(first.substring(1,first.length()))+" "+last.substring(0,1).toUpperCase().concat(last.substring(1,last.length())));

    }
}



