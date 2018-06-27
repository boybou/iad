package ding;

public class CountCount {

    public static void main (String[] args) {
        int i = 10;
        countDown(i); // Tel af tot 0.
        System.out.println(i);
    }

    private static void countDown(int nummer) {
        nummer--;
    }
}
