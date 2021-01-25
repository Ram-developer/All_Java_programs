public class Prime {
    public static void main(String[] args) {
            int count=0;
            int n=1;

            if (n==1){
                System.out.println("No");
            } else {
                for(int i=2;i<=Math.sqrt(n);i++)
                {
                    if(n%i==0){
                        count++;
                    }
                }
                if (count>0){
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }



    }
}
