package C2_Streams.C2_2_RefactoringToStream;

import utils.Repository;
import utils.UserRecord;

import java.util.LinkedList;
import java.util.List;

public class Refactored {
    public static void main(String[] args) {
        //Get the average score of the people who has a higher maximum score than 30000.

        //We dont want to mutate this list!!!
        List<UserRecord> records = Repository.getRecords();


        double average = records.stream()
                .filter(user -> user.getMaxPoints() >= 30000)
                .flatMapToInt(
                        user -> {
                            List<Integer> scores = new LinkedList<>(user.getOtherScores());
                            scores.add(user.getMaxPoints());

                            return scores.stream().mapToInt(Integer::intValue);
                        })
                .average().getAsDouble();

        System.out.println("Average is " + average);
    };
}
