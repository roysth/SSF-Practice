package com.assignment.assignment01.Model;

import java.io.Serializable;
import java.util.List;



//To store the info that was input from the user on the page here
public class Contact implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String item;
    private int price;
    private List<String> cartList;

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public List<String> getCartList() {
        return cartList;
    }
    public void setCartList(List<String> cartList) {
        this.cartList = cartList;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }










    
}
