package test;

import java.util.LinkedList;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {

        List<User> list = new LinkedList<>();
        list.add(new User("lu", 19));
        list.add(new User("chu", 19));
        list.add(new User("qin", 18));
        list.add(new User("lu2", 18));

        User user1 = list.stream().filter(User -> User.age == 18).findFirst().orElse(null);
        System.out.println(user1.name);

    }





}
