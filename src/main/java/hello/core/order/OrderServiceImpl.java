package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements  OrderService{
    private final MemoryMemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();



    @Override
    public Order createOrder(Long memberID, String itemname, int itemPrice) {
        Member member = memberRepository.findById(memberID);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberID,itemname,itemPrice,itemPrice);
    }
}