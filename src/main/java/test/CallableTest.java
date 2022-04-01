package test;

import java.util.concurrent.*;

public class CallableTest {

    public static void main(String[] args) throws Exception {

    }



    public static void test(Callable callable) throws Exception {
        callable.call();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(10));
        Future<?> submit = threadPoolExecutor.submit(new Thread2());
        Object o = submit.get();
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("1111");
        }
    }

}
