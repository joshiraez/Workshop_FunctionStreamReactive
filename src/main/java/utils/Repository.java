package utils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Repository {
    private static List<UserRecord> records = new LinkedList<>() {{
        add(new UserRecord(1,
                "Juan",
                20,
                25000,
                Arrays.asList(18000)));
        add(new UserRecord(2,
                "Pepe",
                34,
                45000,
                Arrays.asList(18000, 20000, 23000, 45000)));
        add(new UserRecord(3,
                "Isa",
                19,
                52000,
                Arrays.asList(40000, 51000, 20000)));
        add(new UserRecord(4,
                "Teresa",
                32,
                26000,
                Arrays.asList(15000, 20000)));
        add(new UserRecord(5,
                "AAA",
                28,
                60000,
                Arrays.asList(12000, 40000)));
    }};

    public static List<UserRecord> getRecords() {
        return records;
    }

}
