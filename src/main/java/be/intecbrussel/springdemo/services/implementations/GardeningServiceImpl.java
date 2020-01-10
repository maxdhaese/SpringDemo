package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.GardeningService;
import be.intecbrussel.springdemo.services.GardeningTool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GardeningServiceImpl implements GardeningService {
    @Bean
    public GardeningTool nestedGardeningTool(){
        return new GardeningTool() {
            @Override
            public void doGardenJob() {
                System.out.println("nestedtool");
            }
        };
    }



    @Autowired
    private GardeningTool gardeningTool;

    public GardeningServiceImpl(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
        System.out.println("constructing gardening service");
    }

    public GardeningTool getGardeningTool(){
        return gardeningTool;
    }

    public void setGardeningTool(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
    }

    public void init(){
        System.out.println("Gardening service has started");
    }

    public void destroy(){
        System.out.println("Gardening service has ended");
    }

    public void garden(){
        System.out.println("Working in the garden");
        gardeningTool.doGardenJob();
    }
}
