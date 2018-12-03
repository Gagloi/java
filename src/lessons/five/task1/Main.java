package lessons.five.task1;

import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        Tree tree = new Tree(new Node(1,null,null));
        tree.root =  new Node(2,new Node(34, new Node(654, null, null), new Node(123, null, null)),new Node(43, new Node(234, null, null), new Node(987, null, null)));
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
