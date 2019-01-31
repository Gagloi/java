package lessons.eight.task1;


import java.util.function.Consumer;

public class Tree {
    Node root;
    static int isAllNodes;

    public void traverse(Consumer consumer){
        root.recPreOrder(consumer);
    }




    public Tree(Node root, int a){
        this.root = root;
        isAllNodes = a;
    }


}
