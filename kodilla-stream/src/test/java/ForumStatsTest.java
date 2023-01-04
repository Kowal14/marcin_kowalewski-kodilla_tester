import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import optional.homework.ForumStats;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ForumStatsTest {
    @Test
    void testAvgPostOlder() {
        List<User> users = UsersRepository.getUsersList();
        assertEquals(2.25, new ForumStats().getAverageOfOlder(users));
    }
    @Test
    void testAvgYounger() {
        List<User> users = UsersRepository.getUsersList();
        assertEquals(2382, new ForumStats().getAverageOfYounger(users));


    }
}
