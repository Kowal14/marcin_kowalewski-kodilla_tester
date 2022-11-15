import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;



public class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> users = UsersManager.filterChemistGroupUsernames();
        assertEquals(2, users.size());
        assertTrue(users.contains("Walter White"));
        assertTrue(users.contains("Gale Boetticher"));


    }

    @Test
    public void testUsersOlderThan40() {
        int age = 40;
        List<User> users = UsersManager.usersOlderThan40(40);
        for (User user : users) {
            assertTrue(user.getAge() > 40);
        }


    }

    @Test
    public void testPostedMoreThan5Posts() {
        int number = 5;
        List<String> users = UsersManager.postedMoreThan5Posts(5);
        assertEquals(3, users.size());
    }
}