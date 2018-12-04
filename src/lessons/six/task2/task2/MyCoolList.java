package lessons.six.task2.task2;

import java.util.Iterator;

public class MyCoolList<T> implements Iterable{
    private T[] value;
    public MyCoolList(T[] value){
        this.value = value;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator = new Iterator() {
            int i = -1;
            int n = MyCoolList.this.value.length;
            @Override
            public boolean hasNext() {
                return i < n;
            }

            @Override
            public Object next() {
                i++;
                T next = MyCoolList.this.value[i];
                return next;
            }
        };
        return iterator;
    }

    public void add(T object){
        T[] value = new T[this.value.length + 1];
        int i = 0;
        for (i = 0; i < this.value.length; i++){
            value[i] = this.value[i];
        }
        value[this.value.length] = object;
    }
}
