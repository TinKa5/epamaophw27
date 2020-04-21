package ua.epam.annotationConfig;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class AnnotationAspect {

    private final Logger log = Logger.getLogger(this.getClass().getName());

    @Pointcut("@annotation(ua.epam.annotation.Log)")
    public void loggingAnnotation(){}

    @Pointcut("execution(* ua.epam.model.Bakery.pack(..))")
    public void loggingPack(){}


    @Before("loggingAnnotation()")
    public void beforeAdvice(JoinPoint joinPoint){
        log.log(Level.INFO,"before method "+joinPoint.getSignature().getName());


    }

    @Around("loggingPack()")
    public Object returnAdvice(ProceedingJoinPoint joinPoint){
        try {
            Object result = joinPoint.proceed();
            log.log(Level.INFO, "Around method " + joinPoint.getSignature().getName()+" with result "+result);
            return result;
        }catch (Throwable e){
            log.log(Level.WARNING, "Exception in Around method " + joinPoint.getSignature().getName());
            return new IllegalArgumentException();
        }
    }
}
