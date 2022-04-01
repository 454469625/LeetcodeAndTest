package test;

import java.sql.SQLOutput;

public class ThreadTest {
    static Object o = new Object();
    static volatile int i = 0;


    public static void main(String[] args) {
        new Thread(() -> {
            while (i < 200) {

                if (i % 5 == 0) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    i++;
                }

            }
        }).start();
        new Thread(() -> {
            while (i < 200) {
                if (i % 5 == 1) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    i++;
                }
            }
        }).start();
        new Thread(() -> {
            while (i < 200) {

                if (i % 5 == 2) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    i++;
                }

            }
        }).start();
        new Thread(() -> {
            while (i < 200) {

                if (i % 5 == 3) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    i++;
                }

            }
        }).start();
        new Thread(() -> {
            while (i < 200) {
                if (i % 5 == 4) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    i++;
                }
            }
        }).start();

    }

}
