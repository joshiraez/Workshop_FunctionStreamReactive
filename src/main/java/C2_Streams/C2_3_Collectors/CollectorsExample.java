package C2_Streams.C2_3_Collectors;

import utils.Repository;
import utils.UserRecord;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {
    /**
     * CollectorsExample are a special type of reduces (stream terminators) that will return the stream to
     * a concrete class. Java has collectors for Lists, Maps, etc.
     */

    public static void main(String[] args) {
        List<UserRecord> users = Repository.getRecords();

        Map<String, UserRecord> nameToUser = users.stream()
                .collect(Collectors.toMap(
                        //Key
                        (UserRecord user) -> user.getName(),
                        //Value
                        Function.identity()
                ));

        System.out.println(nameToUser);
    }
}
