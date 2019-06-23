package C1_LambdasAndFunctionInterfaces.C1_2_UsingFunctionTypes;

import utils.UserRecord;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionTypes {

    /**
     * If you set a Function interface as the type of any variable (local variable, attribute,
     * input to a function, etc) you can pass them as data.
     *
     * That makes them useful pragmatically because now we can treat them as units we can move around or store.
     */

    private static int giveMe10() {
        return 10;
    }

    private static int powerOf2(int number) {
        return number * number;
    }

    private static void getInConsole(int number) {
        System.out.println(number);
    }

    //To function interfaces
    private static Supplier<Integer> giveMe10Function = FunctionTypes::giveMe10;
    private static Function<Integer, Integer> powerOf2Function = FunctionTypes::powerOf2;
    private static Consumer<Integer> getInConsoleFunction = FunctionTypes::getInConsole;

    public static void main(String[] args) {
        getInConsole(powerOf2(giveMe10()));

        getInConsoleFunction.accept(powerOf2Function.apply(giveMe10Function.get()));
    }
}
