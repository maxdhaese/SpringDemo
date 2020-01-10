package be.intecbrussel.springdemo.services.implementations;

import be.intecbrussel.springdemo.services.CleaningService;
import be.intecbrussel.springdemo.services.CleaningTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CleaningRobot implements CleaningService {

    @Autowired
    private List<CleaningTool> cleaningTools;

    public CleaningRobot (){
        System.out.println("Cleaning robot constructor has been called");
    }

    public List<CleaningTool> getCleaningTools() {
        return cleaningTools;
    }

    public void setCleaningTools(List<CleaningTool> cleaningTools) {
        this.cleaningTools = cleaningTools;
    }

    @Override
    public void clean() {
        cleaningTools.forEach(CleaningTool::doCleanJob);

    }
}
