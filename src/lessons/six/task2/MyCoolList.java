package lessons.six.task2;

import java.util.Iterator;

public class MyCoolList<T> implements Iterable{
    private T[] value;
    public MyCoolList(T[] value){
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
                T next = MyCoolList.this.value[i++];
                return next;
            }
        };
        return iterator;
    }

    public void add(T t){
        T[] value = (T[])(new Object[this.value.length + 1]);
        for (int i = 0; i < this.value.length; i++){
            value[i] = this.value[i];
        }
        value[this.value.length] = t;
        this.value = value;
    }
}
