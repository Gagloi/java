package lessons.eight.task1;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

public class Node {
    int inf;

    public AtomicBoolean used;
    public String label;
    public StringBuilder builder = new StringBuilder();

    Node left;
    Node right;

    public Node(int inf, Node left, Node right, AtomicBoolean used) {
        this.inf = inf;
        this.left = left;
        this.right = right;
        this.used = used;
        this.label = "Node " + inf + " is free";
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
}

