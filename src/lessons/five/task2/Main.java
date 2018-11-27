package lessons.five.task2;

public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[4];
        MyCoolList list = new MyCoolList(objects);
        for (Object it: list){
            System.out.println(it);
        }
    }
}
