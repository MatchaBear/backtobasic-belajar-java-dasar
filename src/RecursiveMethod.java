package src;

public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(1));
        loop(10000);
    }


    static long factorialRecursive(long value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }


    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");

        } else {
            System.out.println("Loop-" + value);
            loop(value - 1);
        }
    }

}