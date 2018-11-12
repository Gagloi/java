package lessons.four.task5;

public class SuperClass{
    public static void main(String[] args) {
        Fibo fibo = new Fibo(5);
        for (Object number: fibo) {
            System.out.println(number);
        }
    }

}
