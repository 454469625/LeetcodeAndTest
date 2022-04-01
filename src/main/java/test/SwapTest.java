package test;

public class SwapTest {

    public static void main(String[] args) {
        int a = 11;
        int b = 5;
        swap(a, b);
    }

    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);
    }
}
