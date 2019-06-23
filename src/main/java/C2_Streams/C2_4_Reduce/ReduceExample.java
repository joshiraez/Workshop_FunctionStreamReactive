package C2_Streams.C2_4_Reduce;

import java.util.stream.IntStream;

public class ReduceExample {
    /**
     * Reduce is the most generic terminal operation.
     *
     * From an identity that acts as the base, it accumulates in the given variable
     * and returns us the result.
     */

    public static void main(String[] args) {

        int sum = IntStream.of(3, 10, 23)
                        .reduce(
                                0,
                                Integer::sum
                        );

        System.out.println("Sum is "+sum);
    }
}
