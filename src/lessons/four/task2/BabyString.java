package lessons.four.task2;

public class BabyString extends Sort {
    @Override
    public boolean compare(Object object1, Object object2) {
        return object1.toString().compareTo(object2.toString()) > 0;
    }
}
