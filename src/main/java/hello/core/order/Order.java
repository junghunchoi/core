package hello.core.order;

public class Order {

    private Long memberID;
    private String itemname;
    private int itemprice;
    private int discountPrice;

    public Order(Long memberID, String itemname, int itemprice, int discountPrice) {
        this.memberID = memberID;
        this.itemname = itemname;
        this.itemprice = itemprice;
        this.discountPrice = discountPrice;
    }


    public int calculatePrice(){
        return itemprice - discountPrice;
    }


    public Long getMemberID() {
        return memberID;
    }

    public void setMemberID(Long memberID) {
        this.memberID = memberID;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public int getItemprice() {
        return itemprice;
    }

    public void setItemprice(int itemprice) {
        this.itemprice = itemprice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "order{" +
                "memberID=" + memberID +
                ", itemname='" + itemname + '\'' +
                ", itemprice=" + itemprice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
