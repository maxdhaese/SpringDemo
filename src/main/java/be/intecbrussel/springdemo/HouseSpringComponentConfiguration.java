package be.intecbrussel.springdemo;

import be.intecbrussel.springdemo.services.CleaningService;
import be.intecbrussel.springdemo.services.DomesticService;
import be.intecbrussel.springdemo.services.GardeningService;
import be.intecbrussel.springdemo.services.implementations.DomesticServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HouseSpringComponentConfiguration {

    @Bean
    public DomesticService domesticService(GardeningService gardeningService, CleaningService cleaningService) {
        DomesticServiceImpl domesticService = new DomesticServiceImpl();
        domesticService.setGardeningService(gardeningService);
        domesticService.setCleaningService(cleaningService);
        return domesticService;
    }
}
