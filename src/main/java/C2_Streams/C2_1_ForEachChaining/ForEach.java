package C2_Streams.C2_1_ForEachChaining;

import utils.Repository;
import utils.UserRecord;

import java.util.LinkedList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        //Get the average score of the people who has a higher maximum score than 30000.

        //We dont want to mutate this list!!!
        List<UserRecord> records = Repository.getRecords();

        //First we get those with a higher score than 30000.
        List<UserRecord> withHigherScore = new LinkedList<>();
        for(UserRecord user: records) {
            if(user.getMaxPoints() >= 30000) {
                withHigherScore.add(user);
            }
        }

        //Then, we are left with a list of their scores.
        List<Integer> scores = new LinkedList<>();
        for(UserRecord user: withHigherScore) {
            List<Integer> userScores = new LinkedList<>();

            userScores.addAll(user.getOtherScores());
            userScores.add(user.getMaxPoints());

            scores.addAll(userScores);
        }

        //Finally, we do the average
        int sum = 0;
        for(Integer score: scores) {
            sum += score;
        }

        float average = sum/(float)scores.size();

        System.out.println("Average is "+average);
    }
}
