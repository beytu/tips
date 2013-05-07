package fr.gunduz.tips.jdeb;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author 
 */
@Slf4j
public class Main 
{

    public static void main(String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
        
    }
    
    
    
    
    
}
