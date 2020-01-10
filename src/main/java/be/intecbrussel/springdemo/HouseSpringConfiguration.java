package be.intecbrussel.springdemo;

import be.intecbrussel.springdemo.services.*;
import be.intecbrussel.springdemo.services.implementations.*;
import org.springframework.context.annotation.*;


public class HouseSpringConfiguration {

    @Bean(name = {"BrOom", "broom", "bezem"})
    @Scope("prototype")
    @Lazy
    public CleaningTool broom() {
        return new Broom();
    }

    @Bean(name = "Steven")
    @Scope("prototype")
    @Lazy
    public CleaningTool vacuum() {
        return new VacuumCleaner();
    }

    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
    public CleaningTool dusty() {
        return new DisposableDuster();
    }

    @Bean
    public GardeningTool lawnMower() {
        return new LawnMower();
    }


    @Bean
    @Lazy
    public CleaningService disposableDusterService() {
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTools(null);
        return cs;

    }

    @Bean
    @Lazy
    public CleaningService broomCleaningService() {
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTools(null);
        return cs;
    }


    @Bean
    @Lazy
    @Primary
    public CleaningService vacuumCleaningService() {
        CleaningServiceImpl cs = new CleaningServiceImpl();
        cs.setCleaningTools(null);
        return cs;
    }


    @Bean
    public GardeningService gardeningService(GardeningTool gardeningTool) {
        GardeningServiceImpl gardeningService = new GardeningServiceImpl(gardeningTool);
        gardeningService.setGardeningTool(gardeningTool);
        return gardeningService;
    }

    @Bean
    public DomesticService domesticService(GardeningService gardeningService, CleaningService cleaningService) {
        DomesticServiceImpl domesticService = new DomesticServiceImpl();
        domesticService.setGardeningService(gardeningService);
        domesticService.setCleaningService(cleaningService);
        return domesticService;
    }


}
