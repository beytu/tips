package fr.gunduz.tips.jdeb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *
 * @author 
 */
@Slf4j
@Component
public class Checker 
{
    
    @Scheduled(fixedRate = 5000)
    public void check()
    {
        log.debug("task executed");
        
    }
    
}
