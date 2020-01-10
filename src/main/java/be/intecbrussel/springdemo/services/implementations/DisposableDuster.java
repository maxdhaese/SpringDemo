package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class DisposableDuster implements CleaningTool {
    private boolean filthy = false;

    public DisposableDuster(){
        System.out.println("constructor message: constructing disposable duster");
    }



    @Override
    public void doCleanJob() {

        if(filthy){
            System.out.println("swiffing");

        }else {
            System.out.println("it's filthy");
        }

    }
}
