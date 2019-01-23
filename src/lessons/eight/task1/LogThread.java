package lessons.eight.task1;

import java.util.Random;
import java.util.function.Consumer;

public class LogThread implements Runnable {

    private Node root;
    private StringBuilder stringBuilder;

    LogThread(Node root, StringBuilder stringBuilder){
        this.root = root;
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                Node node = (Node) o;
                if (((Node) o).used.compareAndSet(false, true)){
                    System.out.println(((Node) o).inf + Thread.currentThread().getName());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
    }
}
