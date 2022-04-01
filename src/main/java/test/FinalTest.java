package test;
import java.util.concurrent.atomic.AtomicBoolean;

public class FinalTest {
    public static void main(String[] args) {
        Person person = new Person();
        Person.atomicBoolean.set(false);
        System.out.println(Person.getAtomicBoolean().get());
        A a = new A();
        a.getValue();

    }
}


final class Person {

    public Person() {
    }

    static final AtomicBoolean atomicBoolean = new AtomicBoolean(true);

    public static void start() {
        atomicBoolean.set(false);
    }

    public static AtomicBoolean getAtomicBoolean() {
        return atomicBoolean;
    }
}

class A {

    public A() {
    }

    int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}



