package hello.core.order;


public interface OrderService {
    Order createOrder(Long memberID, String itemname, int itemPrice);
}
