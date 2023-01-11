package optional.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
    double avgPostOlder = getAverageOfOlder(UsersRepository.getUsersList());
    double avgPostYounger = getAverageOfYounger(UsersRepository.getUsersList());
        System.out.println(avgPostOlder);
        System.out.println(avgPostYounger);
    }
    public static double getAverageOfOlder(List<User> users) {
        double avgPostOlder = users

                .stream()
                .filter(user -> (user.getAge() >= 40))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgPostOlder;


    }
    public static double getAverageOfYounger(List<User> users) {
        double avgPostYounger = users
                .stream()
                .filter(user -> (user.getAge() < 40))
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
        return avgPostYounger;


    }
}
