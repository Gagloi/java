package lessons.seven.task3;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class User {
    private String name;
    private String surname;
    private int age;
    private Set<User> friends;

    public User(String name, String surname, int age, Set<User> friends){
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.friends = friends;
    }

    public Set<User> friendsFriends(){
        System.out.println(friends.stream()
                .filter(it -> it.friends != null)
                .flatMap(user -> user.friends.stream())
                .distinct()
                .collect(Collectors.toList()));
        return null;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public static int func(User one, User two){
        int i = 0;
        List<User> list = one.friends.stream()
                .filter(it -> it.friends != null)
                .collect(Collectors.toList());
        //System.out.println(list);
        while (!list.contains(two)){
            i++;
            list = list.stream()
                    .filter(it -> it.friends != null)
                    .flatMap(user -> user.friends.stream())
                    .distinct()
                    .collect(Collectors.toList());
            System.out.println(list);
        }
        return i;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
