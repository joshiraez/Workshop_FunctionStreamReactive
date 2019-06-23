package C2_Streams.C2_8_Sort;

import utils.Repository;
import utils.UserRecord;

import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    /**
     * Streams are ordered (in the order of the iterable of the given collection).
     *
     * You can sort them inside a stream chain
     */

    public static void main(String[] args) {
        List<UserRecord> sortedByRecord = Repository.getRecords().stream()
                .sorted((o1, o2) -> -Integer.compare(o1.getMaxPoints(), o2.getMaxPoints()))
                .collect(Collectors.toUnmodifiableList());

        System.out.println(sortedByRecord);
    }
}
