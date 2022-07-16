package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberID= 1L;

        Member member = new Member(memberID,"memberA", Grade.VIP);
        Order order = orderService.createOrder(memberID, "itemA", 1000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
