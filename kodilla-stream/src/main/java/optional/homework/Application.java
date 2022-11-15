package optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Marcin kowalewski", new Teacher("Jan Nowak")));
        students.add(new Student("Tomasz Brzozowski", new Teacher("Krzysztof Król")));
        students.add(new Student("Jolanta Prus", null));

        for (Student student : students) {
            System.out.println(student.name + Optional.ofNullable(student.teacher).orElseGet(() -> new Teacher("undefined")));
        }
    }
    public static void getCorrectPair(String name, Teacher teacher) {
        System.out.println(name+teacher);
    }
}

