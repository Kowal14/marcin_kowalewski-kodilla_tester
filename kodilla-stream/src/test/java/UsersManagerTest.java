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
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        assertEquals(2, usernames.size());
    }

    @Test
    public void testUsersOlderThan40() {
        int age = 40;
        List<String> User = UsersRepository.getUsersList()
                .stream()
                .filter(user -> (user.getAge() > age))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        assertEquals(4, User.size());
    }

    @Test
    public void testPostedMoreThan5Posts() {
        int number = 5;
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> (user.getNumberOfPost() > number))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        assertEquals(3, usernames.size());
    }
}