package optional.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        int age = 40;
        double avgPostOlder = UsersRepository.getUsersList()

                .stream()
                .filter(user -> (user.getAge() >= age))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avgPostOlder);

        double avgPostYounger = UsersRepository.getUsersList()

                .stream()
                .filter(user -> (user.getAge() < age))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(avgPostYounger);
    }
    public double getAverageOfOlder(List<User> users) {
        double avgPostOlder = users

                .stream()
                .filter(user -> (user.getAge() >= 40))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgPostOlder;


    }
    public double getAverageOfYounger(List<User> users) {
        double avgPostYounger = users
                .stream()
                .filter(user -> (user.getAge() < 40))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgPostYounger;


    }
}
