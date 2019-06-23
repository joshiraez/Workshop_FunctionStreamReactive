package C2_Streams.C2_6_Filter;

import utils.Repository;
import utils.UserRecord;

public class Filtering {
    /**
     * The filter operation reduces the number of elements on the stream based on the given predicate.
     *
     * The rule of thumb is: after you filter, you might have a shrunk stream. While with map it will always be
     * the same size, reduce will always end in one element and flatMap should expand the stream.
     */

    public static void main(String[] args) {
        UserRecord ofAAA = Repository.getRecords().stream()
                            .filter(user -> user.getName().equals("AAA"))
                            .findFirst()
                            .get();

        System.out.println(ofAAA);
    }
}
