package lessons.eight.task1;

import java.util.Random;
import java.util.function.Consumer;

public class ThreadWork implements Runnable{
    Node root;


    /*public void recPreOrder(Consumer consumer){
        if (left!=null) {
            consumer.accept(left);
            left.recPreOrder(consumer);
        }
        if (right!=null) {
            consumer.accept(right);
            right.recPreOrder(consumer);
        }
    }*/

    ThreadWork (Node root){
        this.root = root;
    }


    @Override
    public void run() {
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                Node node = (Node) o;
                //System.out.println(((Node) o).inf);
                if (((Node) o).used.compareAndSet(false, true)){
                    System.out.println(((Node) o).inf + Thread.currentThread().getName());
                    try {
                        Random random = new Random();
                        Thread.sleep(random.nextInt(5000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        root.recPreOrder(consumer);
    }
}
