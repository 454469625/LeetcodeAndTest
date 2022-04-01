package test;

public class SynchronizedTest {

    public static void main(String[] args) {
        SynchronizedTest synchronizedTest = new SynchronizedTest();
        synchronizedTest.A();
    }


    public synchronized void A() {
        C();
        System.out.println("A");
    }

    public synchronized void C() {
        System.out.println("C");
    }
}
