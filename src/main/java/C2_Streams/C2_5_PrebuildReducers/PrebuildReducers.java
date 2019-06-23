package C2_Streams.C2_5_PrebuildReducers;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PrebuildReducers {
    /**
     * There are many reducers already built into the stream api.
     *
     * All collectors are also special cases of reducers
     */

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = numbers.stream().mapToInt(Integer::intValue).average().getAsDouble();
        long count = numbers.stream().count();

        System.out.println("Sum "+sum+", avg "+average+", count "+count);
    }
}
