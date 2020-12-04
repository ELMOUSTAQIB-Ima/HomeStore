package com.cursan.homestore;

public class Client {
    private String fullname;
    private String address;

    /*Constructeur*/

    public Client(String fullname, String address){
        this.fullname = fullname;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress(){
        return address;
    }
}
