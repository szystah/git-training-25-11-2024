package eu.chrost.javatraining.day2.lectures.arrays;

public class MaxArgument {
    public static void main(String[] args) {
        if (args.length != 0) {
            int maxElement = Integer.parseInt(args[0]);
            for (String arg : args) {
                int intArg = Integer.parseInt(arg);
                if (maxElement < intArg) {
                    maxElement = intArg;
                }
            }
            System.out.println(maxElement);
        }
    }
}
