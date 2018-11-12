package lessons.four.task5;

import java.util.Iterator;

public class Fibo implements Iterable {
    private int n;
    public Fibo(int n){
        this.n = n;
    }

    @Override
    public Iterator iterator() {
        return new FiboIterator();
    }

    class FiboIterator implements Iterator{
        private int prev = 0;
        private int curr = 1;
        private int count = 0;

        @Override
        public boolean hasNext() {
            return n > count;
        }

        @Override
        public Object next() {
            int res = curr + prev;
            prev = curr;
            curr = res;
            count++;
            return res;
        }
    }
}
