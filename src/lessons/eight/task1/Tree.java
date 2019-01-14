package lessons.eight.task1;


public class Tree implements Runnable{
    Node root;

    @Override
    public void run() {
        root.run();
    }

    public Tree(Node root){
        this.root = root;
    }


}
