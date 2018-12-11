package lessons.seven.task3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<User> users1 = new HashSet<>();
        Set<User> users2 = new HashSet<>();
        Set<User> users3 = new HashSet<>();
        Set<User> users4 = new HashSet<>();

        User sergey = new User("Sergey", "Bag", 18, users2);
        User vlad = new User("Vladislav", "Drob", 19, users1);
        User old = new User("Yaroslav", "Piven", 19, users3);
        User young = new User("Yaroslav", "Redko", 18, users4);

        users1.add(sergey);

        users2.add(old);

        users3.add(young);

        users4.add(vlad);

        //sergey.friendsFriends();
        System.out.println(User.func(sergey, vlad));



    }
}
