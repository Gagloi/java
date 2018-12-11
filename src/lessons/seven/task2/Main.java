package lessons.seven.task2;

import java.util.ArrayList;
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

        Block block1 = new Block(1, 6);

        List<Block> blocks = new ArrayList<>();
        blocks.add(block1);

        List<Integer> blackList = new ArrayList<>();
        blackList.add(1);
        blackList.add(7);

        lol(abonents, blocks, blackList);


    }

    public static List<Abonent> lol(List<Abonent> abonents, List<Block> blocks, List<Integer> black){
        List<Integer> list = abonents.stream()
                .mapToInt(it -> it.getPhone())
                .collect(Collectors.toCollection());
        System.out.println(abonents);
        return null;

    }
}
