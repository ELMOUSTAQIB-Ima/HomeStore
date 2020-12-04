package com.cursan.homestore;

import java.util.HashMap;
import java.util.Map;

public class Bill {
    private Client client;
    private Map<Product, Integer> products = new HashMap<Product,Integer>();
    private Delivery delivery;

    public Bill(Client client,Delivery delivery) {
        this.client = client;
        this.delivery = delivery;
    }


    public void addProduct(Product product,Integer quantity){
        this.products.put(product,quantity);
    }

    public Client getClient(){
        return client;
    }

    public Map<Product,Integer> getProducts(){
        return products;
    }
}
