package eu.chrost.javatraining.day2.exercises.arrays;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("add(int a, int b): " + add(5, 7));
        System.out.println("add(double a, double b): " + add(3.6, 6.8));
        System.out.println("add(int[] a): " + add(new int[]{2, 4, 7, 9}));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int[] a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
