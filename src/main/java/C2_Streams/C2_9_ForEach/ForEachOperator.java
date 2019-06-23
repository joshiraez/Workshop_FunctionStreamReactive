package C2_Streams.C2_9_ForEach;

import utils.Repository;

public class ForEachOperator {
    /**
     * We also have the forEach operator on stream (also on collections!) that is also a terminal
     * operation that has void return type, aka, it doesn't return anything.
     *
     * It accepts a Consumer as its operation.
     */

    public static void main(String[] args) {

        System.out.println("RECORDS");
        System.out.println("-------");
        Repository.getRecords().stream()
                .sorted((o1, o2) -> -Integer.compare(o1.getMaxPoints(), o2.getMaxPoints()))
                .forEach(System.out::println);
    }
}
