import optional.homework.Student;
import optional.homework.Teacher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {
    @Test
    void shouldHaveTeacher() {
        Student student = new Student("Marcin", new Teacher("Mateusz"));
        assertEquals("Mateusz", student.getTeacherName());
    }

    @Test
    void shouldntHaveTeacher() {
        Student student = new Student("Marcin", null);
        assertEquals("undefined", student.getTeacherName());

    }
}