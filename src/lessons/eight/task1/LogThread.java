package lessons.eight.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.function.Consumer;

public class LogThread implements Runnable {

    private Node root;
    private FileWriter writer;

    LogThread(Node root, File file){
        this.root = root;
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void run() {
        try {
            recursiveFunc();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void recPreOrder(Node node) throws IOException{
        if (node.left!=null) {
            writer.write(node.left.label + "\n");
            recPreOrder(node.left);
        }
        if (node.right!=null) {
            writer.write(node.right.label + "\n");
            recPreOrder(node.right);
        }
    }

    void recursiveFunc() throws IOException, InterruptedException {
        writer.write(root.label + "\n");
        recPreOrder(root);
        while(Tree.isAllNodes != 15){
            Thread.sleep(1000);
            writer.write(root.label + "\n");
            recPreOrder(root);
        }
        writer.close();
    }
}
