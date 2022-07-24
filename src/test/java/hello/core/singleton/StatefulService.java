package hello.core.singleton;

public class StatefulService {
    private int price;

    public int order(String name, int price){
        System.out.println("name" +name +"price" + price);
        this.price = price;

        // 리턴값을 통해 싱글톤의 문제를 예방한다.
        return price;
    }

//    public int getPrice() {
//        return price;
//    }



}
