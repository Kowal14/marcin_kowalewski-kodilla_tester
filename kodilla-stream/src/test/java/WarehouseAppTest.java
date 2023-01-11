import com.kodilla.exception.homework.Order;
import com.kodilla.exception.homework.OrderDoesntExistsException;
import com.kodilla.exception.homework.Warehouse;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;

public class WarehouseAppTest {
    @Test
    void isExceptionGood() {
        Order order = new Order("one");
        Order order1 = new Order("two");
        Order order2 = new Order("three");
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(order);
        warehouse.addOrder(order1);
        warehouse.addOrder(order2);

        assertThrows(OrderDoesntExistsException.class,()->{
            warehouse.getOrder("four");
        });

    }
}
