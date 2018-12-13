package lessons.seven.task2;

public class Block {
    private int startNumber;
    private int endNumber;

    public Block(int start, int end){
        startNumber = start;
        endNumber = end;
    }

    public int getStartNumber() {
        return startNumber;
    }

    @Override
    public String toString() {
        return "Block{" +
                "startNumber=" + startNumber +
                ", endNumber=" + endNumber +
                '}';
    }

    public int getEndNumber() {
        return endNumber;
    }
}
