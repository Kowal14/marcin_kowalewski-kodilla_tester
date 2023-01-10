package execution_model.homework;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class ShopTestSuite {

    Shop shop = new Shop();
    Order one = new Order(111, 1000, 01.01, "Marcin");
    Order two = new Order(222, 2000, 02.01, "Kasia");
    Order three = new Order(333, 3000, 03.01, "Mateusz");

    @Test
    public void shouldAddOrderstoShop() {

        int numberOfOrders = shop.getSize();
        assertEquals(3, numberOfOrders);
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(one);
        shop.addOrder(two);
        shop.addOrder(three);
    }
}




