package test;

public class ThreadLocalTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal threadLocal = new ThreadLocal();
        new Thread(() -> {
            threadLocal.set("123");
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
        }).start();
        Thread.sleep(1);
        threadLocal.set("12");

        System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());
    }
}
