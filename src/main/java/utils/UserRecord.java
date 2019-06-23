package utils;

import java.util.List;

public class UserRecord {

    private long id;
    private String name;
    private int age;
    private int maxPoints;
    private List<Integer> top5;

    public UserRecord(long id, String name, int age, int maxPoints, List<Integer> top5) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.maxPoints = maxPoints;
        this.top5 = top5;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public int getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public List<Integer> getOtherScores() {
        return top5;
    }

    public void setTop5(List<Integer> top5) {
        this.top5 = top5;
    }

    @Override
    public String toString() {
        return "UserRecord{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", maxPoints=" + maxPoints +
                ", top5=" + top5 +
                '}';
    }

}
