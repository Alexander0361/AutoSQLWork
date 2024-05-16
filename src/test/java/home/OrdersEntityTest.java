package home;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.home.OrdersEntity;
import java.sql.SQLException;


public class OrdersEntityTest extends AbstractTest {

    @Test
    void testGetOrderIdReturn() {
        OrdersEntity ordersEntity = new OrdersEntity();
        ordersEntity.setOrderId((short) 2);
        Assertions.assertEquals(2, ordersEntity.getOrderId());
    }

    @Test
    void testGetDate() {
        OrdersEntity ordersEntity = new OrdersEntity();
        ordersEntity.setDateGet("2022-01-01");
        Assertions.assertEquals("2022-01-01", ordersEntity.getDateGet());
    }

    @Test
    void testNotEqualsCheck() {
        OrdersEntity ordersEntity1 = new OrdersEntity();
        ordersEntity1.setOrderId((short) 3);
        ordersEntity1.setDateGet("2022-01-01");
        OrdersEntity ordersEntity2 = new OrdersEntity();
        ordersEntity2.setOrderId((short) 4);
        ordersEntity2.setDateGet("2022-01-02");
        Assertions.assertFalse(ordersEntity1.equals(ordersEntity2));
    }

    @Test
    void testEqualsCheck() {
        OrdersEntity ordersEntity1 = new OrdersEntity();
        ordersEntity1.setOrderId((short) 5);
        ordersEntity1.setDateGet("2022-01-01");
        OrdersEntity ordersEntity2 = new OrdersEntity();
        ordersEntity2.setOrderId((short) 5);
        ordersEntity2.setDateGet("2022-01-01");
        Assertions.assertTrue(ordersEntity1.equals(ordersEntity2));
    }
}
