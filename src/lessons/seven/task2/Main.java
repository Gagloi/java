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
        List<Integer> list = abonents.stream().map(Abonent::getPhone).collect(Collectors.toList());
        list.removeAll(black);
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        List<Block> blocks1 = blocks.stream()
                .forEach(block -> {
                    if (block.getStartNumber() < iterator.next()){
                        
                    }
                });



        return null;

    }
}
