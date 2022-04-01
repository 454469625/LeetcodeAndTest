package test;

import java.lang.management.BufferPoolMXBean;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TypeConvertTest {
    public static void main(String[] args) throws IllegalAccessException {

        TypeConvertTest typeConvertTest = new TypeConvertTest();
        Parent parent = new Parent();
        Son son = new Son();
//        System.out.println(son.hashCode());
        Parent parent1 = (Parent) son;
        parent1.setAge("18");
        System.out.println("由son转换成的parent1，son与parent1相等：" + (son == parent1));


//        System.out.println(son.getAge());
        Class<?> clazz = parent1.getClass();
//        System.out.println(clazz.getName());
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field.getName());
            field.set(son, "1");
            Class<?> type = field.getType();
            System.out.println(type.getName());
        }
        System.out.println(son.getAge());   //18
        System.out.println(son.getSex());   //1
        System.out.println(son.getName());  //null

        parent.setAge("11");
        parent.setName("22");
        typeConvertTest.buildSon(son, parent);
        System.out.println(son.getSex());

    }

    private void buildSon(Son son, Parent parent) {
        son.setSex(parent.getAge());

    }
}

class Parent{
    String name;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

class Son extends Parent{
    String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}



