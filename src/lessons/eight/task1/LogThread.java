package lessons.eight.task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.function.Consumer;

public class LogThread implements Runnable {

    private Node root;
    private File file;
    private StringBuilder stringBuilder;
    private FileWriter writer;

    LogThread(Node root, StringBuilder stringBuilder){
        this.root = root;
        this.stringBuilder = stringBuilder;
        this.file = new File("log.txt");
        try {
            file.createNewFile();
            writer = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {
        try {
            recPreOrder(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void recPreOrder(Node node) throws IOException{


        if (node.left!=null) {
            writer.write(Thread.currentThread().getName() + " get the node with info " + node.inf + "\n");
            recPreOrder(node.left);
        }
        if (node.right!=null) {
            writer.write(Thread.currentThread().getName() + " get the node with info " + node.inf + "\n");
            recPreOrder(node.right);
        }
    }
}
