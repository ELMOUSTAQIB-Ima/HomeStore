package com.cursan.homestore;

public class RelayDelivery  implements Delivery {

    private int number;

    //les num entre 1 a 22 gratuits
    //les num de 23 a 47 sont a 2.99
    //les autres sont a 4.99

    public ReleyDelivery(int number){
        this.number=number;

    }

    @Override
    public double getPrice(){
        if(number >= 1 && number <= 22)
            return 0;
        else if (number >= 23 && number <= 47)
            return 2.99;
        else
            return 4.99;

    }


}
