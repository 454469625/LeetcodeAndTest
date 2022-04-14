package test;

import java.util.Comparator;
import java.util.LinkedList;

public class StringNullTest {
    String s;

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("S220200012-23538");
        list.add("S220200014-24156");
        list.add("G220200001-25258");
        list.add("G220200001-25594");
        list.add("S220300001-08404");
        list.add("G220300001-09553");
        list.add("DK1503697456700698625");
        list.add("DK1504343065831460865");

        list.sort(String::compareTo);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(5);
        list2.add(3);
        list2.add(9);


        list2.sort(Integer::compareTo);


        User u1 = new User("lu", 123);
        User u2 = new User("lu", 123);
        LinkedList<User> l3 = new LinkedList<>();
        l3.add(u1);
        l3.add(u2);
        l3.sort((u3, u4) -> u3.age - u4.age);
        l3.sort((u3, u4) -> {
            return u3.age - u4.age;
        });
        l3.sort(Comparator.comparingInt(u3 -> u3.age));


    }
}

class User {
    String name;
    int age;

    @Override
    public int hashCode() {
        return (name + age).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        User u = (User)obj;
        return (name + age).equals(u.name + u.age);
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
