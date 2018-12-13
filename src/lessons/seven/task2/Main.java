package lessons.seven.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Abonent abonent = new Abonent(5);
        Abonent abonent1 = new Abonent(7);
        Abonent abonent2 = new Abonent(9);

        List<Abonent> abonents = new LinkedList<>();

        abonents.add(abonent);
        abonents.add(abonent1);
        abonents.add(abonent2);

        Block block1 = new Block(1, 9);
        Block block2 = new Block(10,20);

        List<Block> blocks = new ArrayList<>();
        blocks.add(block1);
        blocks.add(block2);

        List<Integer> blackList = new ArrayList<>();
        blackList.add(1);
        blackList.add(7);


        lol(abonents, blocks, blackList);


    }

    public static List<Abonent> lol(List<Abonent> abonents, List<Block> blocks, List<Integer> black){
        Iterator<Integer> blackListIterator = black.iterator();
        while (blackListIterator.hasNext()){
            Integer buf = blackListIterator.next();
            for(Block block: blocks){
                if(block.getStartNumber() < buf && block.getEndNumber() > buf){
                    blackListIterator.remove();
                    blocks.add(new Block(block.getStartNumber(), buf - 1));
                    blocks.add(new Block(buf + 1, block.getEndNumber()));
                    break;
                }else if(block.getStartNumber() == buf){
                    blackListIterator.remove();
                    blocks.add(new Block(block.getStartNumber(), buf - 1));
                    blocks.add(new Block(buf + 1, block.getEndNumber()));
                    break;
                }
            }
        }
        System.out.println(blocks);

        return null;

    }
}
