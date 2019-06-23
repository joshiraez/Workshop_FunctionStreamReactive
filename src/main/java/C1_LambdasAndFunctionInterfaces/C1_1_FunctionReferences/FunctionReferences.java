package C1_LambdasAndFunctionInterfaces.C1_1_FunctionReferences;

import java.util.function.Supplier;

public class FunctionReferences {
    /**
     * Function references is a way Java gives us to wrap our currently available Functions and methods
     * in the new Function interface. Anything that would expect a Function interface, will accept
     * also a function or method reference.
     */

    public static int giveMe10() {
        return 10;
    }


    //All those 3 will do the same
    public static void method1()  {
        System.out.println(giveMe10());
    }

    public static void acceptInt(int toPrint) {
        System.out.println(toPrint);
    }

    public static void method2() {
        acceptInt(giveMe10());
    }

    public static void acceptFunction(Supplier<Integer> givesToPrint) {
        System.out.println(givesToPrint.get());
    }

    public static void method3() {
        acceptFunction(FunctionReferences::giveMe10);
    }


    public static void main(String[] args) {
        //Do your tests here or create your own test

        method1();

        method2();

        method3();
    }
}
