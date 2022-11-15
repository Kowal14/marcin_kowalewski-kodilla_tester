package optional.homework;

import com.kodilla.stream.UsersRepository;

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
}
