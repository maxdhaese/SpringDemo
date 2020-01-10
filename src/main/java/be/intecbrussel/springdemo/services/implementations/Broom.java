package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Broom implements CleaningTool {
    public void doCleanJob() {
        System.out.println("Scrub Scrub");
    }
}
