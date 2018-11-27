package lessons.five.task2;

import java.util.Iterator;

public class MyCoolList implements Iterable{
    private Object[] value;
    public MyCoolList(Object[] value){
        this.value = value;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = new Iterator() {
            int i = 0;
            int n = MyCoolList.this.value.length;
            @Override
            public boolean hasNext() {
                return i < n;
            }

            @Override
            public Object next() {
                Object next = MyCoolList.this.value[i];
                return next;
            }
        };
        return iterator;
    }

    public void add(Object object){
        Object[] value = new Object[this.value.length + 1];
        int i = 0;
        for (Object it: value){
            value[i] = it;
            i++;
        }
        value[this.value.length + 1] = object;
    }
}
