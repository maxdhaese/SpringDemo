package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.GardeningTool;
import org.springframework.stereotype.Component;

@Component
public class LawnMower implements GardeningTool {
    @Override
    public void doGardenJob() {
        System.out.println("Cutting Grass, yo");

    }
}
