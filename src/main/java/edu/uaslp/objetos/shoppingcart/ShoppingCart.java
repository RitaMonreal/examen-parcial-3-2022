package edu.uaslp.objetos.shoppingcart;

import edu.uaslp.objetos.exception.EmptyShoppingCartException;
import edu.uaslp.objetos.exception.InvalidDataException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> shoppingCart = new ArrayList<>();

    public void add(Item item){
        shoppingCart.add(item);
    }

    public BigDecimal getTotalCost() {
        if(shoppingCart.isEmpty()){
            throw new EmptyShoppingCartException();
        }

        BigDecimal totalCost = BigDecimal.ZERO;

        for(Item item: shoppingCart){
            totalCost = totalCost.add(item.getUnitCost().multiply(BigDecimal.valueOf(item.getQuantity())));
        }

        return totalCost;
    }


    public boolean isEmpty() {
        return shoppingCart.isEmpty();
    }

    public void addItem(Item item) {
        if(item.getCode()==null){
            throw new InvalidDataException("Null or empty string not allowed for item code");
        }

        if(item.setProviderCode().isEmpty()){
            throw new InvalidDataException("Null or empty string not allowed for provider code");
        }

        if(item.getUnitCost().compareTo(BigDecimal.ZERO) < 0){
            throw new InvalidDataException("Cost must be greater than zero");
        }

        if(item.getQuantity() < 1 || item.getQuantity() > 5){
            throw new InvalidDataException("Quantity must be greater than zero and lower than 5");
        }

        for(Item existentItem : shoppingCart){
            if(existentItem.getCode().equals(item.getCode()) && existentItem.getUnitCost().compareTo(item.getUnitCost())==0){
                existentItem.setQuantity(existentItem.getQuantity() + item.getQuantity());
                return;
            }
        }
        shoppingCart.add(item);
    }

    public int getItemsCount() {
        int count = 0;

        for(Item item : shoppingCart){
            count += item.getQuantity();
        }
        return count;
    }

    public List<Item> getItems() {
        return shoppingCart;//AQUI ASI LO TIENE EL PROFE, PERO NO SIRVE
    }

    public void removeItem(String itemCode) {
        for(Item item : shoppingCart){
            if(item.getCode().equals(itemCode)){
                item.setQuantity(item.getQuantity()-1);
            }

            if(item.getQuantity()==0){
                shoppingCart.remove(item);
            }
            return;
        }
    }
}
