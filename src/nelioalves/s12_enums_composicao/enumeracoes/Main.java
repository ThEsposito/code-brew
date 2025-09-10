package nelioalves.s12_enums_composicao.enumeracoes;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1010, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os2);
    }
}
