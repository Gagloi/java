package lessons.four.task2;

public class BabyInteger extends Sort {
    @Override
    public boolean compare(Object object1, Object object2) {
        int one = (Integer)object1;
        int two = (Integer)object2;
        return one > two;
    }
}
