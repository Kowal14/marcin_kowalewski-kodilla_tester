package optional.homework;

import java.util.Optional;

public class Student {

    public String name;
    public Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;

    }
    public String getTeacherName() {
        Teacher resultTeacher = Optional.ofNullable(teacher).orElseGet(() -> new Teacher("undefined"));
        return resultTeacher.getName();


    }
}
