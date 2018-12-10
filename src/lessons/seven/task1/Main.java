package lessons.seven.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Abonent abonent1 = new Abonent("123456789");
        Abonent abonent2 = new Abonent("987654321");
        Abonent abonent3 = new Abonent("1");

        Set<Abonent> list1 = new HashSet<>();
        Set<Abonent> list2 = new HashSet<>();

        list1.add(abonent1);
        list1.add(abonent2);

        list2.add(abonent2);
        list2.add(abonent3);

        //Пересечение
        for (Abonent o: intersect(list1, list2)){
            System.out.println(o);
        }
        //Обьеденение
        for(Abonent o: union(list1, list2)){
            System.out.println(o);
        }
        //Разность
        for(Abonent o: difference(list1, list2)){
            System.out.println(o);
        }
        //Симметрическая разность
        for(Abonent o: symmetricalDifference(list1, list2)){
            System.out.println(o);
        }

    }

    static Set<Abonent> intersect(Set<Abonent> list1, Set<Abonent> list2){
        list1.retainAll(list2);
        return list1;
    }

    static Set<Abonent> union(Set<Abonent> list1, Set<Abonent> list2){
        Set<Abonent> result = new HashSet<>();

        result.addAll(list1);
        result.addAll(list2);
        return result;
    }

    static Set<Abonent> difference(Set<Abonent> list1, Set<Abonent> list2){
        list1.removeAll(list2);
        return list1;
    }

    static Set<Abonent> symmetricalDifference(Set<Abonent> list1, Set<Abonent> list2){
        Set<Abonent> result = new HashSet<>();
        result.addAll(list1);
        result.addAll(list2);
        Set<Abonent> sum = intersect(list1, list2);
        result.removeAll(sum);
        return result;
    }




}
