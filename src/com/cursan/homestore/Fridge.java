package com.cursan.homestore;

public class Fridge extends Product{
    private int liter;
    private Boolean freezer;


    public Fridge(String name, String description, double price, int liter,boolean freezer) {
        super(name, description, price);
        this.liter = liter;
        this.freezer= freezer;
    }

    public boolean isFreezer(){
        return freezer;
    }

    public int getLiter()
    {
        return liter;
    }
}
