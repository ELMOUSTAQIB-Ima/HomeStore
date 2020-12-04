package com.cursan.homestore;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Product(String name,String description,double price)
        Product cafe = new Product("philips","Philips senseo,Noir",79.99);

        //Television(String name,String description,double price,int size,String slabType)
        Television tv = new Television("TV Samsung UE","Smart TV LED",599,49,"LED");

        //Fridge(String name, String description, double price, int liter,boolean freezer)
        Fridge fridge = new Fridge("BEKO TSE","Refrigerateur BEKO",189,130,false);

        //Customer(String fullname,String address)
        Client client= new Client("Juste Leblanc","19 rue Germain,Paris");

        //Bill bill = new Bill(client;
        //bill.addProduct(cafe,1);
        //bill.addProduct(tv,1);
        //bill.addProduct(fridge,1);

        //Un objet Television peux ainsi etre considerer comme un objet Product
        //Generalisation

        Product tv = new Television("TV Samsung UE","Smart TV LED",599,49,"LED");


    }
}
