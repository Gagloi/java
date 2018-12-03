package lessons.six.task1;

import java.util.function.Consumer;

public class Node<T> {
    T inf;

    Node left;
    Node right;

    public Node(T inf, Node left, Node right) {
        this.inf = inf;
        this.left = left;
        this.right = right;
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
