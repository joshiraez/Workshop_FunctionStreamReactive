package C2_Streams.C2_10_FlatMap;

import utils.Repository;

public class FlatMapping {
    /**
     * This is the only operation that can return more elements than the original stream.
     *
     * It takes a Function that for each element of the stream, it expects to return a stream.
     * He will later merge every one of those streams into one huge stream.
     *
     * As, is a 1 to N operation.
     *
     * It's usually used to "flatten" List of Lists, or any Collection of Collections, but if you can get
     * a stream from a data, then it can be flattened.
     */

    public static void main(String[] args) {

        //We will flat map the other scores to a single stream to get the lowest score of them all.
        int lowestScore = Repository.getRecords().stream()
                .flatMapToInt(user -> user.getOtherScores().stream().mapToInt(Integer::intValue))
                .min()
                .getAsInt();

        System.out.println("The lowest score was "+lowestScore);
    }
}
