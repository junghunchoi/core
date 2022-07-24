package hello.core.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService1 = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        /* 싱글톤의 문제
        //THREAD A : A사용자 10000원 주문
        statefulService1.order("usera", 10000);
        //THREAD A : A사용자 10000원 주문
        statefulService1.order("userb", 20000);

        // a 기준으로 만원이 나와야하는데 같은 객체를 바라보므로 2만원이 출력이된다.
        int price = statefulService1.getPrice();
        System.out.println(price);
        */

        //대처법
        int useraprice = statefulService1.order("usera", 10000);
        int userbprice = statefulService2.order("userb", 20000);

        System.out.println(useraprice);
        System.out.println(userbprice);

    }

        static  class TestConfig {
            @Bean
            public StatefulService statefulService() {
                return new StatefulService();
            }
        }
}