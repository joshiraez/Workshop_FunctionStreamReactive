package C1_LambdasAndFunctionInterfaces.C1_5_Lambdas;

import C1_LambdasAndFunctionInterfaces.C1_4_FunctionalInterfaces.IComparatorIsFunctionalButWhatever;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambdas {
    /**
     * Lambdas are the literal of the functional interfaces, giving us a way to define a function concisely on the fly.
     */
    private static Supplier<Integer> giveMe10Function = () -> 10;
    private static Function<Integer, Integer> powerOf2Function = number -> number*number;
    private static Consumer<Integer> getInConsoleFunction = number -> {
        System.out.println(number);
    };
    private static Consumer<Integer> getInConsoleFunction2 = number -> System.out.println(number); //too
    //private static Consumer<Integer> getInConsoleFunction3 = number -> 3; //Wont compile. Returns something

    private static IComparatorIsFunctionalButWhatever<Integer> withLambda = (a, b) -> a-b;
}
