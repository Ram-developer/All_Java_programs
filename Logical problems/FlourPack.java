public class FlourPack{
    public static void main(String[] args) {
        System.out.println(canPack (2, 10, 18));
    }
   /* public static boolean canPack (int bigCount, int smallCount, int goal){
        if (bigCount<0||smallCount<0||goal<0){
            return false;
        }
        int totalKilos = (5 * bigCount) + smallCount;
        int count =0;
        int temp = 0;
        if (totalKilos < goal){
            return false;
        }
        else if (totalKilos == goal){
            return true;
        }
        else{
            for(int i=0;i<goal;i++){
                temp = goal - i;
                if (temp % 5 == 0){
                    break;
                }
            }
            if (bigCount>= temp/5) {
                goal = goal - temp;
                if (smallCount >= goal) {
                    return true;
                }
                return false;
            }
            else{
                goal = goal - (temp-bigCount*5);
                if (smallCount >= goal) {
                    return true;
                }
                return false;
            }
        }
    }*/
   public static boolean canPack(int bigCount, int smallCount, int goal){

       if(bigCount<0 || smallCount<0 || goal<0)
           return false;
       int weight = 5*bigCount + smallCount;
       if(weight == goal)
           return true;
       else {
           if(weight > goal && smallCount >= goal%5) return true;
           else if (bigCount == 0 && smallCount >= goal)
               return true;
           else return false;
       }

   }
}
