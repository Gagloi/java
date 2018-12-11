package lessons.six.task1;

import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root =  new Node(1,new Node(34, new Node<Integer>(654, null, null), new Node<Integer>(123, null, null)),new Node<Integer>(43, new Node<Integer>(234, null, null), new Node<Integer>(987, null, null)));
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                Node node = (Node) o;
                System.out.println(((Node) o).inf);
            }
        };
        tree.traverse(consumer);

    }
}
