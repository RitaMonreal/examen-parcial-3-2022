package edu.uaslp.objetos.shoppingcart;

import java.math.BigDecimal;

public class Item {
    private String code;
    private String unitCost;
    private int quantity;
    private int providerCode;

    public Item(String code, String unitCost, int quantity, int providerCode) {
        this.code = code;
        this.unitCost = unitCost;
        this.quantity = quantity;
        this.providerCode = providerCode;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(int providerCode) {
        this.providerCode = providerCode;
    }
}
