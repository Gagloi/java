package lessons.three;

public class LuckyTicket {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 1000000; i++){
                if (isLucky(sumThree(i % 1000),sumThree(i / 1000))){
                    count++;
                }
        }
        System.out.println(count);
    }

    public static boolean isLucky(int sum1, int sum2){
        return sum1 == sum2 ? true:false;
    }

    public static int sumThree(int n){
        int sum = 0;
       while (n != 0){
           sum += n%10;
           n /=10;
       }
        return sum;
    }

}
