package ua.epam.annotationConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import ua.epam.model.Bakery;
import ua.epam.model.Product;
@Component
@EnableAspectJAutoProxy
public class AnnotationAopDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("ua.epam");
        Bakery bakery=applicationContext.getBean(Bakery.class);

        bakery.prepareDough();
        bakery.form(Product.bred);
        bakery.bake(Product.bred);
        bakery.pack(Product.cookie);
    }

}
