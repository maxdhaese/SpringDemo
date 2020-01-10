package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class VacuumCleaner implements CleaningTool {
    public void doCleanJob(){
        System.out.println("Zuuuuuuuuuuuuuu");
    }
}
