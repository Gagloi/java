package lessons.four.task2;

public class BabyString extends Sort {
    String a;


    public  boolean compare(Object object1, Object object2) {
        return object1.toString().compareTo(object2.toString()) > 0;
    }

    public static void main(String[] args) {
        BabyString a = new BabyString();
        BabyString b = new BabyString();
        a.a = "b";
        b.a = "a";
        String[] strings ={a.a, b.a};
        System.out.println(strings[0]);

    }
}
