package C1_LambdasAndFunctionInterfaces.C1_4_FunctionalInterfaces;

public class FunctionalInterfaces {
    /**
     * Every one of these function interfaces are marked with the anotation @FunctionalInterfaces.
     *
     * A functional interface can only have one public method, but it can be referenced with method references
     * and lambdas
     */

    public static IComparatorIsFunctionalButWhatever<Integer> storingComparable = Integer::compare;

    public static void main(String[] args) {
        if (storingComparable.compare(11, 10) >= 0) {
            System.out.println("11 es mayor o igual que 10");
        } else {
            System.out.println("10 es mayor que 11 (?)");
        }
    }
}


