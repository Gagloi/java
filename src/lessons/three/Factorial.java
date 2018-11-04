package lessons.three;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }

    public static int fact(int n){
        int res = 1;
        for (int i = 0; i < n; i++){
            res = res * (i + 1);
        }
        return n == 0? 0 : res;
    }
}
