package be.intecbrussel.springdemo;

import be.intecbrussel.springdemo.services.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class HouseApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(HouseSpringComponentConfiguration.class);
        applicationContext.getBean("domesticService", DomesticService.class)
                .runHousehold();


        applicationContext.close();



    }
}
