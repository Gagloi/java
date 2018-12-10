package lessons.seven.task3;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<User> users1 = new HashSet<>();
        Set<User> users2 = new HashSet<>();
        Set<User> users3 = new HashSet<>();

        User sergey = new User("Sergey", "Bag", 18, users2);
        User vlad = new User("Vladislav", "Drob", 19, users1);
        User old = new User("Yaroslav", "Piven", 19, users3);
        User young = new User("Yaroslav", "Redko", 18, users1);

        users1.add(sergey);
        users1.add(vlad);

        users2.add(old);
        users2.add(young);

        users3.add(vlad);
        users3.add(old);

        sergey.friendsFriends();



    }
}
