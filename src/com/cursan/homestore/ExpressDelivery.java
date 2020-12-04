package com.cursan.homestore;

public class ExpressDelivery  implements Delivery{
    private String city;

    public ExpressDelivery(String city){
        this.city=city;
    }

    //le prix est de 6.99 a paris.en dehors de paris c'est 9.99
    @Override
    public double getPrice() {
        if (city.equals("Paris"))
            return 6.99;
        else
            return 9.99;
    }
}
