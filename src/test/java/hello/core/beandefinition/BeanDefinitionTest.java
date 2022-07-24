package hello.core.beandefinition;

import hello.core.AppConfig;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext (AppConfig.class);

    @Test
    @DisplayName("빈 설정 메타정보 확인")
    public void findApplicationBean(){
        String[] BeanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : BeanDefinitionNames) {
            BeanDefinition beanDefinition = ac.getBeanDefinition(beanDefinitionName);

            if(beanDefinition.getRole() == BeanDefinition.ROLE_APPLICATION){
                System.out.println("DefName" + beanDefinition + "BeanDef" + beanDefinition);
            }
        }
    }
}
