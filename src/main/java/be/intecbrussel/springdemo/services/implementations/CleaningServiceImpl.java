package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningService;
import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CleaningServiceImpl implements CleaningService {

    @Autowired
    private List<CleaningTool> cleaningTools;

    public CleaningServiceImpl(){
        System.out.println("Cleaning service impl constructor called");
    }


    public List<CleaningTool> getCleaningTools() {
        return cleaningTools;
    }

    public void setCleaningTools(List<CleaningTool> cleaningTools) {
        this.cleaningTools = cleaningTools;
    }

    public void clean(){
        cleaningTools.forEach(CleaningTool::doCleanJob);
    }
}
