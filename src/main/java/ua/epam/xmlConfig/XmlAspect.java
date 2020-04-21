package ua.epam.xmlConfig;

import org.aspectj.lang.JoinPoint;

import java.util.logging.Level;
import java.util.logging.Logger;

public class XmlAspect {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    public void beforeAdvice(JoinPoint joinPoint){
        log.log(Level.INFO,"before method "+joinPoint.getSignature().getName());


    }

    public void returnAdvice(JoinPoint joinPoint){
        log.log(Level.INFO,"after method "+joinPoint.getSignature().getName());
    }
}
