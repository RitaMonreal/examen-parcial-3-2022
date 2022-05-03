package edu.uaslp.objetos.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> shoppingCart;
    private float totalCost;

    public ShoppingCart(){
        shoppingCart = new ArrayList<>();
    }

    public void add(Item item){
        shoppingCart.add(item);
    }

    public float getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isEmpty() {

    }

    public void addItem(Item item) {
    }

    public boolean getItemsCount() {
    }

    public List<Item> getItems() {
    }

    public void removeItem(String code) {
        shoppingCart.remove(item);
    }
}
