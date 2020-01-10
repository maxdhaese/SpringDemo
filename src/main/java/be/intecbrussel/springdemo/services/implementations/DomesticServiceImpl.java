package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningService;
import be.intecbrussel.springdemo.services.DomesticService;
import be.intecbrussel.springdemo.services.GardeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component(value = "domesticService")
public class DomesticServiceImpl implements DomesticService {
    @Autowired
    private CleaningService cleaningService;
    @Autowired
    private GardeningService gardeningService;
    @Autowired
    private Logger logger;


    public DomesticServiceImpl(){
        System.out.println("domestic service started");

    }

    public GardeningService getGardeningService(){
        return gardeningService;
    }

    public CleaningService getCleaningService(){
        return cleaningService;
    }

    @Override
    public void runHousehold() {
        logger.info("starting runhousehold()");
        cleaningService.clean();
        gardeningService.garden();

    }

    public void setCleaningService(CleaningService cs ){

    }

    public void setGardeningService(GardeningService gs){

    }
}
