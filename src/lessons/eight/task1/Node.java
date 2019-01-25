package lessons.eight.task1;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Node {
    int inf;

    public AtomicBoolean used;
    public String label;

    Node left;
    Node right;

    public Node(int inf, Node left, Node right, AtomicBoolean used) {
        this.inf = inf;
        this.left = left;
        this.right = right;
        this.used = used;
    }

    public void recPreOrder(Consumer consumer){
        if (left!=null) {
            consumer.accept(left);
            left.recPreOrder(consumer);
        }
        if (right!=null) {
            consumer.accept(right);
            right.recPreOrder(consumer);
        }
    }

    public void logPreOrder(){
        if (left!=null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + left.inf);
            left.logPreOrder();
        }
        if (right!=null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + left.inf);
            right.logPreOrder();
        }
    }
/*
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
        recPreOrder(consumer);
    }*/
}
