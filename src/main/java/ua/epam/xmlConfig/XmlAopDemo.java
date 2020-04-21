package ua.epam.xmlConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.epam.model.Bakery;
import ua.epam.model.Product;

public class XmlAopDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("context.xml");
        Bakery bakery=applicationContext.getBean(Bakery.class);

        bakery.prepareDough();
        bakery.form(Product.bred);
        bakery.bake(Product.bred);
        bakery.pack(Product.cookie);
    }

}
