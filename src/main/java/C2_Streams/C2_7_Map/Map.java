package C2_Streams.C2_7_Map;

import utils.Repository;

public class Map {
    /**
     * Map allows us to transform data. Usually this can be operating on the data (same type) or changing its type
     * (transforming).
     *
     * Remember that because we use a data structure, all data should have a common type or interface. This allows
     * us to move between types/interfaces for different operations.
     *
     * As a rule of thumb, map will always remain the same number of elements.
     */

    public static void main(String[] args) {

        //Notice max only exists after mapping to int
        int maxScore = Repository.getRecords().stream()
                .mapToInt(user -> user.getMaxPoints())
                .max()
                .getAsInt();

        System.out.println("Max was "+maxScore);
    }
}
