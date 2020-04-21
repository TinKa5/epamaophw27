package ua.epam.model;

import org.springframework.stereotype.Component;
import ua.epam.annotation.Log;
@Component
public class Bakery {

    @Log
    public void prepareDough(){

    }

    @Log
    public void form(Product product){

    }

    @Log
    public void bake(Product product){

    }

    public String pack(Product product){
        return product.getBarcode();

    }


}
