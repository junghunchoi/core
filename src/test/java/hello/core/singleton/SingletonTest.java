package hello.core.singleton;

import hello.core.AppConfig;
import hello.core.member.MemberService;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SingletonTest {
    @Test
    @DisplayName("스프링 없는 순수 DI 컨테이너")
    public void pureContainer(){
        AppConfig appConfig = new AppConfig();

        //1. 조회: 호출할 때 마다 객체를 생성
        MemberService memberService1 = appConfig.memberService();

        //2. 조회 : 호출할 때 마다 객체를 생성
        MemberService memberService2 = appConfig.memberService();

        System.out.println("memberService1" + memberService1);
        System.out.println("memberService2" + memberService2);

    }

    @Test
    @DisplayName("싱글톤 패턴")
    public void springContainer(){
        //AppConfig appConfig = new AppConfig();
        ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);

        //1. 조회: 호출할 때 마다 객체를 생성
        MemberService memberService1 = ap.getBean("memberService", MemberService.class);

        //2. 조회 : 호출할 때 마다 객체를 생성
        MemberService memberService2 = ap.getBean("memberService", MemberService.class);

        System.out.println("memberService1" + memberService1);
        System.out.println("memberService2" + memberService2);

    }
}
