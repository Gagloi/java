package lessons.eight.task1;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Node implements Runnable{
    int inf;
    String label;
    AtomicBoolean used;

    Node left;
    Node right;

    public Node(int inf, String label, AtomicBoolean used, Node left, Node right) {
        this.inf = inf;
        this.label = label;
        this.used = used;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        System.out.println("Я ран!");
    }

    public void recPreOrder(){
        if (left!=null) {
            System.out.println(left.inf);
            left.recPreOrder();
        }
        if (right!=null) {
            System.out.println(right.inf);
            right.recPreOrder();
        }
    }

}
